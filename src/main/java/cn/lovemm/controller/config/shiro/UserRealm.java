package cn.lovemm.controller.config.shiro;

import java.util.*;

import javax.annotation.PostConstruct;

import cn.lovemm.model.*;
import cn.lovemm.service.*;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class UserRealm extends AuthorizingRealm {

	private static final Logger logger = LoggerFactory.getLogger(UserRealm.class);

	@Autowired
	private BlogUserService blogUserService;

	@Autowired
	private BlogRoleService blogRoleService;

	@Autowired
	private BlogUserRoleService blogUserRoleService;

	@Autowired
	private BlogRoleResourceService blogRoleResourceService;

	@Autowired
	private BlogResourceService blogResourceService;

	@Autowired
	private BlogUserConfigService blogUserConfigService;

	/**
	 * 设置密码凭证验证方式
	 */
	@PostConstruct
	public void initCredentialsMatcher(){
		setCredentialsMatcher(new CustomCredentialsMatcher());
	}

	/**
	 * 授权验证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		BlogUser user = (BlogUser) super.getAvailablePrincipal(principals);
		logger.info("do shiro authorization - {}", user == null ? null : user.getUserId());
		if (user != null) {
			// 加载用户角色
			BlogUserRoleExample burEx = new BlogUserRoleExample();
			burEx.createCriteria().andUserIdEqualTo(user.getUserId());
			List<BlogUserRoleKey> burs = blogUserRoleService.selectByExample(burEx);
			List<String> roleIds  = new ArrayList<String>();
			if (burs != null && !burs.isEmpty()) {
				burs.forEach(blogUserRoleKey -> {
					roleIds.add(blogUserRoleKey.getRoleId());
				});
			}
			BlogRoleExample brEx = new BlogRoleExample();
			brEx.createCriteria().andRoleIdIn(roleIds);
			List<BlogRole> roles = blogRoleService.selectByExample(brEx);
			Set<String> rolesName = new HashSet<String>();
			for (BlogRole role : roles) {
				rolesName.add(role.getRoleName());
			}

			// 加载用户权限
			BlogRoleResourceExample brrEx = new BlogRoleResourceExample();
			brrEx.createCriteria().andRoleIdIn(roleIds);
			brrEx.setDistinct(true);
			List<BlogRoleResourceKey> brrs = blogRoleResourceService.selectByExample(brrEx);
			List<String> resIds = new ArrayList<String>();
			if (brrs != null && !brrs.isEmpty()) {
				brrs.forEach(blogRoleResourceKey -> {
					resIds.add(blogRoleResourceKey.getResId());
				});
			}
			BlogResourceExample bresEx = new BlogResourceExample();
			bresEx.createCriteria().andResIdIn(resIds);
			List<BlogResource> ress = blogResourceService.selectByExample(bresEx);
			Set<String> resNames = new HashSet<String>();
			for (BlogResource res : ress) {
				resNames.add(res.getPermission());
			}

			// 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			info.setRoles(rolesName);
			info.setStringPermissions(resNames);

			logger.info("load roles：{}, load permissions：{}", rolesName, resNames);

			return info;
		}
		return null;

	}

	/**
	 * 身份验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;

		String userAccount = usernamePasswordToken.getUsername();

		BlogUserExample buEx = new  BlogUserExample();
		BlogUserExample.Criteria buExCr = buEx .createCriteria();
		if (userAccount.matches("^[1][0-9]{10}$")) {
			buExCr.andUserTelEqualTo(userAccount);
		} else if (userAccount.matches("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$")) {
			buExCr.andUserMailEqualTo(userAccount);
		} else {
			buExCr.andUserAccountEqualTo(userAccount);
		}
		List<BlogUser> bUsers = blogUserService.selectByExample(buEx);
		if(bUsers == null || bUsers.isEmpty()){
			throw new UnknownAccountException("用户不存在");
		}
		BlogUser user = bUsers.get(0);
		BlogUser sUser = new  BlogUser();
		sUser.setUserId(user.getUserId());
		sUser.setNickName(user.getNickName());
		sUser.setLastLoginIp(user.getLastLoginIp());
		sUser.setLoginTimes(user.getLoginTimes());
		BlogUserConfigExample bucEx = new BlogUserConfigExample();
		bucEx.createCriteria().andUserIdEqualTo(user.getUserId());
		List<BlogUserConfig> bucs = blogUserConfigService.selectByExample(bucEx);
		Map<String, Object> config = new HashMap<String, Object>();
		if (bucs != null && !bucs.isEmpty()) {
			for (BlogUserConfig buc : bucs) {
				config.put(buc.getConfigKey(), buc.getConfigValue());
			}
		}
		sUser.setConfig(config);
		return new SimpleAuthenticationInfo(sUser, user.getUserPwd(), getName());
	}

}

