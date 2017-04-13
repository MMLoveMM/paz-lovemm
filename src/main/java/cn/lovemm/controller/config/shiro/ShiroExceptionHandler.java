package cn.lovemm.controller.config.shiro;

import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import cn.lovemm.model.SUser;


/**
 * shiro 权限注解模式下，解决未授权抛出异常的问题
 * @author pangpj
 * @date 2017年03月30日
 *
 */
@ControllerAdvice
public class ShiroExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(ShiroExceptionHandler.class);

	@ExceptionHandler(AuthorizationException.class)
	public String unAuthorizationExceptionHandler (AuthorizationException e, HttpServletResponse response) {
		response.setStatus(HttpServletResponse.SC_FORBIDDEN);
		SUser user = (SUser) SecurityUtils.getSubject().getPrincipal();
		logger.error("用户：{}-访问未授权资源：{}", user.getUserId(), e.getMessage());
		return "redirect:/error/403";
	}
}
