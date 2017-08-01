package cn.lovemm.service.impl;

import cn.lovemm.mapper.BlogUserConfigMapper;
import cn.lovemm.model.BlogUserConfig;
import cn.lovemm.model.BlogUserConfigExample;
import cn.lovemm.model.BlogUserConfigKey;
import cn.lovemm.service.BlogUserConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maner on 2blogUserConfigMapper17/4/18.
 */
@Service
public class BlogUserConfigServiceImpl implements BlogUserConfigService {
    
    @Autowired
    private BlogUserConfigMapper blogUserConfigMapper;
    
    public int countByExample(BlogUserConfigExample example) {
        return blogUserConfigMapper.countByExample(example);
    }
    
    public int deleteByExample(BlogUserConfigExample example) {
        return blogUserConfigMapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(BlogUserConfigKey key) {
        return blogUserConfigMapper.deleteByPrimaryKey(key);
    }
    
    public int insert(BlogUserConfig record) {
        return blogUserConfigMapper.insert(record);
    }
    
    public int insertSelective(BlogUserConfig record) {
        return blogUserConfigMapper.insertSelective(record);
    }
    
    public List<BlogUserConfig> selectByExample(BlogUserConfigExample example) {
        return blogUserConfigMapper.selectByExample(example);
    }
    
    public BlogUserConfig selectByPrimaryKey(BlogUserConfigKey key) {
        return blogUserConfigMapper.selectByPrimaryKey(key);
    }
    
    public int updateByExampleSelective(BlogUserConfig record, BlogUserConfigExample example) {
        return blogUserConfigMapper.updateByExampleSelective(record, example);
    }
    
    public int updateByExample(BlogUserConfig record, BlogUserConfigExample example) {
        return blogUserConfigMapper.updateByExample(record, example);
    }
    
    public int updateByPrimaryKeySelective(BlogUserConfig record) {
        return blogUserConfigMapper.updateByPrimaryKeySelective(record);
    }
    
    public int updateByPrimaryKey(BlogUserConfig record) {
        return blogUserConfigMapper.updateByPrimaryKey(record);
    }
}
