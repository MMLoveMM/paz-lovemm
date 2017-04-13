package cn.lovemm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lovemm.mapper.SUserRoleMapper;
import cn.lovemm.model.SUserRoleExample;
import cn.lovemm.model.SUserRoleKey;
import cn.lovemm.service.SUserRoleService;

@Service
public class SUserRoleServiceImpl implements SUserRoleService {
	
	@Autowired
	private SUserRoleMapper sUserRoleMapper;

	public int countByExample(SUserRoleExample example) {
		
		return sUserRoleMapper.countByExample(example);
	}

	public int deleteByExample(SUserRoleExample example) {
		
		return sUserRoleMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(SUserRoleKey key) {
		
		return sUserRoleMapper.deleteByPrimaryKey(key);
	}

	public int insert(SUserRoleKey record) {
		
		return sUserRoleMapper.insert(record);
	}

	public int insertSelective(SUserRoleKey record) {
		
		return sUserRoleMapper.insertSelective(record);
	}

	public List<SUserRoleKey> selectByExample(SUserRoleExample example) {
		
		return sUserRoleMapper.selectByExample(example);
	}

	public int updateByExampleSelective(SUserRoleKey record, SUserRoleExample example) {
		
		return sUserRoleMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(SUserRoleKey record, SUserRoleExample example) {
		
		return sUserRoleMapper.updateByExample(record, example);
	}

}
