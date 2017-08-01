package cn.lovemm.service.impl;

import cn.lovemm.mapper.BlogTagMapper;
import cn.lovemm.model.BlogTag;
import cn.lovemm.model.BlogTagExample;
import cn.lovemm.service.BlogTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maner on 2blogTagMapper17/4/18.
 */
@Service
public class BlogTagServiceImpl implements BlogTagService {
    
    @Autowired
    private BlogTagMapper blogTagMapper;
    
    public int countByExample(BlogTagExample example) {
        return blogTagMapper.countByExample(example);
    }
    
    public int deleteByExample(BlogTagExample example) {
        return blogTagMapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(String tagId) {
        return blogTagMapper.deleteByPrimaryKey(tagId);
    }
    
    public int insert(BlogTag record) {
        return blogTagMapper.insert(record);
    }
    
    public int insertSelective(BlogTag record) {
        return blogTagMapper.insertSelective(record);
    }
    
    public List<BlogTag> selectByExample(BlogTagExample example) {
        return blogTagMapper.selectByExample(example);
    }
    
    public BlogTag selectByPrimaryKey(String tagId) {
        return blogTagMapper.selectByPrimaryKey(tagId);
    }
    
    public int updateByExampleSelective(BlogTag record, BlogTagExample example) {
        return blogTagMapper.updateByExampleSelective(record, example);
    }
    
    public int updateByExample(BlogTag record, BlogTagExample example) {
        return blogTagMapper.updateByExample(record, example);
    }
    
    public int updateByPrimaryKeySelective(BlogTag record) {
        return blogTagMapper.updateByPrimaryKeySelective(record);
    }
    
    public int updateByPrimaryKey(BlogTag record) {
        return blogTagMapper.updateByPrimaryKey(record);
    }
}
