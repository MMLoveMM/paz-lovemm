package cn.lovemm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lovemm.mapper.SRoleResourcesMapper;
import cn.lovemm.model.SResource;
import cn.lovemm.model.SRoleResourcesExample;
import cn.lovemm.model.SRoleResourcesKey;
import cn.lovemm.service.SRoleResourcesService;

@Service
public class SRoleResourcesServiceImpl implements SRoleResourcesService {

	@Autowired
	private SRoleResourcesMapper sRoleResourcesMapper;

	public int countByExample(SRoleResourcesExample example) {

		return sRoleResourcesMapper.countByExample(example);
	}

	public int deleteByExample(SRoleResourcesExample example) {

		return sRoleResourcesMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(SRoleResourcesKey key) {

		return sRoleResourcesMapper.deleteByPrimaryKey(key);
	}

	public int insert(SRoleResourcesKey record) {

		return sRoleResourcesMapper.insert(record);
	}

	public int insertSelective(SRoleResourcesKey record) {

		return sRoleResourcesMapper.insertSelective(record);
	}

	public List<SRoleResourcesKey> selectByExample(SRoleResourcesExample example) {

		return sRoleResourcesMapper.selectByExample(example);
	}

	public int updateByExampleSelective(SRoleResourcesKey record, SRoleResourcesExample example) {

		return sRoleResourcesMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(SRoleResourcesKey record, SRoleResourcesExample example) {

		return sRoleResourcesMapper.updateByExample(record, example);
	}

}
