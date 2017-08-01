package cn.lovemm.service.impl;

import cn.lovemm.mapper.BlogRoleMapper;
import cn.lovemm.model.BlogRole;
import cn.lovemm.model.BlogRoleExample;
import cn.lovemm.service.BlogRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maner on 2blogRoleMapper17/4/18.
 */
@Service
public class BlogRoleServiceImpl implements BlogRoleService {
    
    @Autowired
    private BlogRoleMapper blogRoleMapper;
    
    public int countByExample(BlogRoleExample example) {
        return blogRoleMapper.countByExample(example);
    }
    
    public int deleteByExample(BlogRoleExample example) {
        return blogRoleMapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(String roleId) {
        return blogRoleMapper.deleteByPrimaryKey(roleId);
    }
    
    public int insert(BlogRole record) {
        return blogRoleMapper.insert(record);
    }
    
    public int insertSelective(BlogRole record) {
        return blogRoleMapper.insertSelective(record);
    }
    
    public List<BlogRole> selectByExample(BlogRoleExample example) {
        return blogRoleMapper.selectByExample(example);
    }
    
    public BlogRole selectByPrimaryKey(String roleId) {
        return blogRoleMapper.selectByPrimaryKey(roleId);
    }
    
    public int updateByExampleSelective(BlogRole record, BlogRoleExample example) {
        return blogRoleMapper.updateByExampleSelective(record, example);
    }
    
    public int updateByExample(BlogRole record, BlogRoleExample example) {
        return blogRoleMapper.updateByExample(record, example);
    }
    
    public int updateByPrimaryKeySelective(BlogRole record) {
        return blogRoleMapper.updateByPrimaryKeySelective(record);
    }
    
    public int updateByPrimaryKey(BlogRole record) {
        return blogRoleMapper.updateByPrimaryKey(record);
    }
}
