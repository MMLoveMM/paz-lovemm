package cn.lovemm.mapper;

import cn.lovemm.model.SResource;
import cn.lovemm.model.SRoleResourcesExample;
import cn.lovemm.model.SRoleResourcesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SRoleResourcesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role_resource
     *
     * @mbggenerated
     */
    int countByExample(SRoleResourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role_resource
     *
     * @mbggenerated
     */
    int deleteByExample(SRoleResourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role_resource
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(SRoleResourcesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role_resource
     *
     * @mbggenerated
     */
    int insert(SRoleResourcesKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role_resource
     *
     * @mbggenerated
     */
    int insertSelective(SRoleResourcesKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role_resource
     *
     * @mbggenerated
     */
    List<SRoleResourcesKey> selectByExample(SRoleResourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role_resource
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SRoleResourcesKey record, @Param("example") SRoleResourcesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role_resource
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SRoleResourcesKey record, @Param("example") SRoleResourcesExample example);

    /**
     * @author pangpj 2017年03月28日17:15:34
     * 根据角色id  获取角色资源
     * @param userId 角色id
     * @return
     */
    List<SResource> getResourcesByUserId(String userId);
}