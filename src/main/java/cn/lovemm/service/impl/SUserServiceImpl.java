package cn.lovemm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lovemm.mapper.SUserMapper;
import cn.lovemm.model.SUser;
import cn.lovemm.model.SUserExample;
import cn.lovemm.service.SUserService;

@Service
public class SUserServiceImpl implements SUserService {

	@Autowired
	private SUserMapper sUserMapper;
	
	public int countByExample(SUserExample example) {
		
		return sUserMapper.countByExample(example);
	}

	public int deleteByExample(SUserExample example) {
		
		return sUserMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String userId) {
		
		return sUserMapper.deleteByPrimaryKey(userId);
	}

	public int insert(SUser record) {
		
		return sUserMapper.insert(record);
	}

	public int insertSelective(SUser record) {
		
		return sUserMapper.insertSelective(record);
	}

	public List<SUser> selectByExample(SUserExample example) {
		
		return sUserMapper.selectByExample(example);
	}

	public SUser selectByPrimaryKey(String userId) {
		
		return sUserMapper.selectByPrimaryKey(userId);
	}

	public int updateByExampleSelective(SUser record, SUserExample example) {
		
		return sUserMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(SUser record, SUserExample example) {
		
		return sUserMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(SUser record) {
		
		return sUserMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SUser record) {
		
		return sUserMapper.updateByPrimaryKey(record);
	}

	/**
	 * 根据用户帐号（邮箱、手机、自定义）查询用户
	 * @param username
	 * @return
	 */
	public SUser selectByUserMultiName(String username) {
		SUserExample mUserEp = new  SUserExample();
		SUserExample.Criteria sUserCr = mUserEp .createCriteria();
		if (username.matches("^[1][0-9]{10}$")) {
			sUserCr.andUserTelEqualTo(username);
		} else if (username.matches("^([a-z0-9A-Z]+[-|\\._]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$")) {
			sUserCr.andUserMailEqualTo(username);
		} else {
			sUserCr.andUserAccountEqualTo(username);
		}
		List<SUser> sUsers = sUserMapper.selectByExample(mUserEp);
		if(sUsers == null || sUsers.isEmpty()){
			return null;
		}
		return sUsers.get(0);
	}
}
