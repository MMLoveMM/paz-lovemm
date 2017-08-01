package cn.lovemm.service.impl;

import cn.lovemm.mapper.BlogUserRoleMapper;
import cn.lovemm.model.BlogUserRoleExample;
import cn.lovemm.model.BlogUserRoleKey;
import cn.lovemm.service.BlogUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maner on 2blogUserRoleMapper17/4/18.
 */
@Service
public class BlogUserRoleServiceImpl implements BlogUserRoleService {
    
    @Autowired
    private BlogUserRoleMapper blogUserRoleMapper;
    
    public int countByExample(BlogUserRoleExample example) {
        return blogUserRoleMapper.countByExample(example);
    }
    
    public int deleteByExample(BlogUserRoleExample example) {
        return blogUserRoleMapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(BlogUserRoleKey key) {
        return blogUserRoleMapper.deleteByPrimaryKey(key);
    }
    
    public int insert(BlogUserRoleKey record) {
        return blogUserRoleMapper.insert(record);
    }
    
    public int insertSelective(BlogUserRoleKey record) {
        return blogUserRoleMapper.insertSelective(record);
    }
    
    public List<BlogUserRoleKey> selectByExample(BlogUserRoleExample example) {
        return blogUserRoleMapper.selectByExample(example);
    }
    
    public int updateByExampleSelective(BlogUserRoleKey record, BlogUserRoleExample example) {
        return blogUserRoleMapper.updateByExampleSelective(record, example);
    }
    
    public int updateByExample(BlogUserRoleKey record, BlogUserRoleExample example) {
        return blogUserRoleMapper.updateByExample(record, example);
    }
}
