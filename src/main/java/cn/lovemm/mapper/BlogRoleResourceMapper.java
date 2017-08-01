package cn.lovemm.mapper;

import cn.lovemm.model.BlogRoleResourceExample;
import cn.lovemm.model.BlogRoleResourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogRoleResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_role_resource
     *
     * @mbggenerated
     */
    int countByExample(BlogRoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_role_resource
     *
     * @mbggenerated
     */
    int deleteByExample(BlogRoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_role_resource
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BlogRoleResourceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_role_resource
     *
     * @mbggenerated
     */
    int insert(BlogRoleResourceKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_role_resource
     *
     * @mbggenerated
     */
    int insertSelective(BlogRoleResourceKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_role_resource
     *
     * @mbggenerated
     */
    List<BlogRoleResourceKey> selectByExample(BlogRoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_role_resource
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BlogRoleResourceKey record, @Param("example") BlogRoleResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_role_resource
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BlogRoleResourceKey record, @Param("example") BlogRoleResourceExample example);
}