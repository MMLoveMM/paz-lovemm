package cn.lovemm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lovemm.mapper.SDataDicMapper;
import cn.lovemm.model.SDataDic;
import cn.lovemm.model.SDataDicExample;
import cn.lovemm.model.SDataDicKey;
import cn.lovemm.service.SDataDicService;

@Service
public class SdataDicServerImpl implements SDataDicService {

	@Autowired
	private SDataDicMapper sDataDicMapper;
	
	public int countByExample(SDataDicExample example) {

		return sDataDicMapper.countByExample(example);
	}

	public int deleteByExample(SDataDicExample example) {
		
		return sDataDicMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(SDataDicKey key) {
	
		return sDataDicMapper.deleteByPrimaryKey(key);
	}

	public int insert(SDataDic record) {
	
		return sDataDicMapper.insert(record);
	}

	public int insertSelective(SDataDic record) {
		
		return sDataDicMapper.insertSelective(record);
	}

	public List<SDataDic> selectByExample(SDataDicExample example) {
		
		return sDataDicMapper.selectByExample(example);
	}

	public SDataDic selectByPrimaryKey(SDataDicKey key) {
		
		return sDataDicMapper.selectByPrimaryKey(key);
	}

	public int updateByExampleSelective(SDataDic record, SDataDicExample example) {
		
		return sDataDicMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(SDataDic record, SDataDicExample example) {
	
		return sDataDicMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(SDataDic record) {
		
		return sDataDicMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SDataDic record) {
		
		return sDataDicMapper.updateByPrimaryKey(record);
	}

}
