package cn.lovemm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lovemm.mapper.SRoleMapper;
import cn.lovemm.model.SRole;
import cn.lovemm.model.SRoleExample;
import cn.lovemm.service.SRoleService;

@Service
public class SRoleServiceImpl implements SRoleService {

	@Autowired
	private SRoleMapper sRoleMapper;
	
	public int countByExample(SRoleExample example) {
		
		return sRoleMapper.countByExample(example);
	}

	public int deleteByExample(SRoleExample example) {
		
		return sRoleMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String roleId) {
		
		return sRoleMapper.deleteByPrimaryKey(roleId);
	}

	public int insert(SRole record) {
		
		return sRoleMapper.insert(record);
	}

	public int insertSelective(SRole record) {
		
		return sRoleMapper.insertSelective(record);
	}

	public List<SRole> selectByExample(SRoleExample example) {
		
		return sRoleMapper.selectByExample(example);
	}

	public SRole selectByPrimaryKey(String roleId) {
		
		return sRoleMapper.selectByPrimaryKey(roleId);
	}

	public int updateByExampleSelective(SRole record, SRoleExample example) {
		
		return sRoleMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(SRole record, SRoleExample example) {
		
		return sRoleMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(SRole record) {
		
		return sRoleMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SRole record) {
		
		return sRoleMapper.updateByPrimaryKey(record);
	}

	/**
	 * @author pangpj 2017年03月28日16:59:28
	 * 根据角色id  获取权限数据
	 */
	public List<SRole> getRolesByUserId(String userId) {
		
		return sRoleMapper.getRolesByUserId(userId);
	}

}
