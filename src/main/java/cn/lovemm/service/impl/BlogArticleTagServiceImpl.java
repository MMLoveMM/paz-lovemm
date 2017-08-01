package cn.lovemm.service.impl;

import cn.lovemm.mapper.BlogArticleTagMapper;
import cn.lovemm.model.BlogArticleTagExample;
import cn.lovemm.model.BlogArticleTagKey;
import cn.lovemm.service.BlogArticleTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maner on 2blogArticleTagMapper17/4/18.
 */
@Service
public class BlogArticleTagServiceImpl implements BlogArticleTagService {

    @Autowired
    private BlogArticleTagMapper blogArticleTagMapper;

    
    public int countByExample(BlogArticleTagExample example) {
        return blogArticleTagMapper.countByExample(example);
    }

    public int deleteByExample(BlogArticleTagExample example) {
        return blogArticleTagMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(BlogArticleTagKey key) {
        return blogArticleTagMapper.deleteByPrimaryKey(key);
    }

    public int insert(BlogArticleTagKey record) {
        return blogArticleTagMapper.insert(record);
    }

    public int insertSelective(BlogArticleTagKey record) {
        return blogArticleTagMapper.insertSelective(record);
    }
    
    public List<BlogArticleTagKey> selectByExample(BlogArticleTagExample example) {
        return blogArticleTagMapper.selectByExample(example);
    }
    
    public int updateByExampleSelective(BlogArticleTagKey record, BlogArticleTagExample example) {
        return blogArticleTagMapper.updateByExampleSelective(record, example);
    }
    
    public int updateByExample(BlogArticleTagKey record, BlogArticleTagExample example) {
        return blogArticleTagMapper.updateByExample(record, example);
    }
}
