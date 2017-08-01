package cn.lovemm.service.impl;

import cn.lovemm.mapper.BlogRoleResourceMapper;
import cn.lovemm.model.BlogRoleResourceExample;
import cn.lovemm.model.BlogRoleResourceKey;
import cn.lovemm.service.BlogRoleResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maner on 2blogRoleResourceMapper17/4/18.
 */
@Service
public class BlogRoleResourceServiceImpl implements BlogRoleResourceService {
    
    @Autowired
    private BlogRoleResourceMapper blogRoleResourceMapper;

    public int countByExample(BlogRoleResourceExample example) {
        return blogRoleResourceMapper.countByExample(example);
    }
    
    public int deleteByExample(BlogRoleResourceExample example) {
        return blogRoleResourceMapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(BlogRoleResourceKey key) {
        return blogRoleResourceMapper.deleteByPrimaryKey(key);
    }
    
    public int insert(BlogRoleResourceKey record) {
        return blogRoleResourceMapper.insert(record);
    }
    
    public int insertSelective(BlogRoleResourceKey record) {
        return blogRoleResourceMapper.insertSelective(record);
    }
    
    public List<BlogRoleResourceKey> selectByExample(BlogRoleResourceExample example) {
        return blogRoleResourceMapper.selectByExample(example);
    }
    
    public int updateByExampleSelective(BlogRoleResourceKey record, BlogRoleResourceExample example) {
        return blogRoleResourceMapper.updateByExampleSelective(record, example);
    }
    
    public int updateByExample(BlogRoleResourceKey record, BlogRoleResourceExample example) {
        return blogRoleResourceMapper.updateByExample(record, example);
    }
}
