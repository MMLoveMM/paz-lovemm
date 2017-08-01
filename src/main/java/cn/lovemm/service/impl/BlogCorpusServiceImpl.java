package cn.lovemm.service.impl;

import cn.lovemm.mapper.BlogCorpusMapper;
import cn.lovemm.model.BlogCorpus;
import cn.lovemm.model.BlogCorpusExample;
import cn.lovemm.service.BlogCorpusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maner on 2blogCorpusMapper17/4/18.
 */
@Service
public class BlogCorpusServiceImpl implements BlogCorpusService {
    
    @Autowired
    private BlogCorpusMapper blogCorpusMapper;
    
    public int countByExample(BlogCorpusExample example) {
        return blogCorpusMapper.countByExample(example);
    }
    
    public int deleteByExample(BlogCorpusExample example) {
        return blogCorpusMapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(String corId) {
        return blogCorpusMapper.deleteByPrimaryKey(corId);
    }
    
    public int insert(BlogCorpus record) {
        return blogCorpusMapper.insert(record);
    }
    
    public int insertSelective(BlogCorpus record) {
        return blogCorpusMapper.insertSelective(record);
    }
    
    public List<BlogCorpus> selectByExample(BlogCorpusExample example) {
        return blogCorpusMapper.selectByExample(example);
    }
    
    public BlogCorpus selectByPrimaryKey(String corId) {
        return blogCorpusMapper.selectByPrimaryKey(corId);
    }
    
    public int updateByExampleSelective(BlogCorpus record, BlogCorpusExample example) {
        return blogCorpusMapper.updateByExampleSelective(record, example);
    }
    
    public int updateByExample(BlogCorpus record, BlogCorpusExample example) {
        return blogCorpusMapper.updateByExample(record, example);
    }
    
    public int updateByPrimaryKeySelective(BlogCorpus record) {
        return blogCorpusMapper.updateByPrimaryKeySelective(record);
    }
    
    public int updateByPrimaryKey(BlogCorpus record) {
        return blogCorpusMapper.updateByPrimaryKey(record);
    }
}
