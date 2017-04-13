package cn.lovemm.service;

import java.util.List;

import cn.lovemm.mapper.SRoleMapper;
import cn.lovemm.model.SRole;

/**
 * 
 * @author pangpj 2017年03月28日16:31:09
 * 权限
 */
public interface SRoleService extends SRoleMapper {
	
	/**
	 * @author pangpj 2017年03月28日16:59:28
	 * 根据角色id  获取权限数据
	 */
	List<SRole> getRolesByUserId(String userId);
}
