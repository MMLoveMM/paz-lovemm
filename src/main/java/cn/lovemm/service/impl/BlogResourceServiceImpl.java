package cn.lovemm.service.impl;

import cn.lovemm.mapper.BlogResourceMapper;
import cn.lovemm.mapper.BlogRoleMapper;
import cn.lovemm.model.BlogResource;
import cn.lovemm.model.BlogResourceExample;
import cn.lovemm.service.BlogResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maner on 2blogResourceMapper17/4/18.
 */
@Service
public class BlogResourceServiceImpl implements BlogResourceService {
    
    @Autowired
    private BlogResourceMapper blogResourceMapper;
    
    public int countByExample(BlogResourceExample example) {
        return blogResourceMapper.countByExample(example);
    }
    
    public int deleteByExample(BlogResourceExample example) {
        return blogResourceMapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(String resId) {
        return blogResourceMapper.deleteByPrimaryKey(resId);
    }
    
    public int insert(BlogResource record) {
        return blogResourceMapper.insert(record);
    }
    
    public int insertSelective(BlogResource record) {
        return blogResourceMapper.insertSelective(record);
    }
    
    public List<BlogResource> selectByExample(BlogResourceExample example) {
        return blogResourceMapper.selectByExample(example);
    }
    
    public BlogResource selectByPrimaryKey(String resId) {
        return blogResourceMapper.selectByPrimaryKey(resId);
    }
    
    public int updateByExampleSelective(BlogResource record, BlogResourceExample example) {
        return blogResourceMapper.updateByExampleSelective(record, example);
    }
    
    public int updateByExample(BlogResource record, BlogResourceExample example) {
        return blogResourceMapper.updateByExample(record, example);
    }
    
    public int updateByPrimaryKeySelective(BlogResource record) {
        return blogResourceMapper.updateByPrimaryKeySelective(record);
    }
    
    public int updateByPrimaryKey(BlogResource record) {
        return blogResourceMapper.updateByPrimaryKey(record);
    }
}
