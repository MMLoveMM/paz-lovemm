package cn.lovemm.service.impl;

import cn.lovemm.mapper.BlogUserMapper;
import cn.lovemm.model.BlogUser;
import cn.lovemm.model.BlogUserExample;
import cn.lovemm.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maner on 2blogUserMapper17/4/18.
 */
@Service
public class BlogUserServiceImpl implements BlogUserService {
    
    @Autowired
    private BlogUserMapper blogUserMapper;
    
    public int countByExample(BlogUserExample example) {
        return blogUserMapper.countByExample(example);
    }
    
    public int deleteByExample(BlogUserExample example) {
        return blogUserMapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(String userId) {
        return blogUserMapper.deleteByPrimaryKey(userId);
    }
    
    public int insert(BlogUser record) {
        return blogUserMapper.insert(record);
    }
    
    public int insertSelective(BlogUser record) {
        return blogUserMapper.insertSelective(record);
    }
    
    public List<BlogUser> selectByExample(BlogUserExample example) {
        return blogUserMapper.selectByExample(example);
    }
    
    public BlogUser selectByPrimaryKey(String userId) {
        return blogUserMapper.selectByPrimaryKey(userId);
    }
    
    public int updateByExampleSelective(BlogUser record, BlogUserExample example) {
        return blogUserMapper.updateByExampleSelective(record, example);
    }
    
    public int updateByExample(BlogUser record, BlogUserExample example) {
        return blogUserMapper.updateByExample(record, example);
    }
    
    public int updateByPrimaryKeySelective(BlogUser record) {
        return blogUserMapper.updateByPrimaryKeySelective(record);
    }
    
    public int updateByPrimaryKey(BlogUser record) {
        return blogUserMapper.updateByPrimaryKey(record);
    }
}
