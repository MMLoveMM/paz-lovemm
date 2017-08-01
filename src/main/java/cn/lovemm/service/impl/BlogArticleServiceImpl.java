package cn.lovemm.service.impl;

import cn.lovemm.mapper.BlogArticleMapper;
import cn.lovemm.model.BlogArticle;
import cn.lovemm.model.BlogArticleExample;
import cn.lovemm.model.BlogArticleWithBLOBs;
import cn.lovemm.service.BlogArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maner on 2blogArticleMapper17/4/18.
 */
@Service
public class BlogArticleServiceImpl implements BlogArticleService {

    @Autowired
    private BlogArticleMapper blogArticleMapper;

    public int countByExample(BlogArticleExample example) {
        return blogArticleMapper.countByExample(example);
    }

    public int deleteByExample(BlogArticleExample example) {
        return blogArticleMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String artId) {
        return blogArticleMapper.deleteByPrimaryKey(artId);
    }

    public int insert(BlogArticleWithBLOBs record) {
        return blogArticleMapper.insert(record);
    }

    public int insertSelective(BlogArticleWithBLOBs record) {
        return blogArticleMapper.insertSelective(record);
    }

    public List<BlogArticleWithBLOBs> selectByExampleWithBLOBs(BlogArticleExample example) {
        return blogArticleMapper.selectByExampleWithBLOBs(example);
    }

    public List<BlogArticle> selectByExample(BlogArticleExample example) {
        return blogArticleMapper.selectByExample(example);
    }

    public BlogArticleWithBLOBs selectByPrimaryKey(String artId) {
        return blogArticleMapper.selectByPrimaryKey(artId);
    }

    public int updateByExampleSelective(BlogArticleWithBLOBs record, BlogArticleExample example) {
        return blogArticleMapper.updateByExampleSelective(record, example);
    }

    public int updateByExampleWithBLOBs(BlogArticleWithBLOBs record, BlogArticleExample example) {
        return blogArticleMapper.updateByExampleWithBLOBs(record, example);
    }

    public int updateByExample(BlogArticle record, BlogArticleExample example) {
        return blogArticleMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(BlogArticleWithBLOBs record) {
        return blogArticleMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKeyWithBLOBs(BlogArticleWithBLOBs record) {
        return blogArticleMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    public int updateByPrimaryKey(BlogArticle record) {
        return blogArticleMapper.updateByPrimaryKey(record);
    }
}
