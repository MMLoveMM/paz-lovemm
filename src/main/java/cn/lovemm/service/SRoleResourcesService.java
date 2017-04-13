package cn.lovemm.service;

import java.util.List;

import cn.lovemm.mapper.SRoleResourcesMapper;
import cn.lovemm.model.SResource;

/**
 * 
 * @author pangpj 2017年03月28日16:32:54
 * 权限资源
 *
 */
public interface SRoleResourcesService extends SRoleResourcesMapper {

	/**
	 * @author pangpj 2017年03月28日17:15:34
	 * 根据角色id  获取角色资源
	 * @param userId 角色id
	 * @return
	 */
	List<SResource> getResourcesByUserId(String userId);

}
