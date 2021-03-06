package cn.lovemm.mapper;

import cn.lovemm.model.SRole;
import cn.lovemm.model.SRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    int countByExample(SRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    int deleteByExample(SRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    int insert(SRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    int insertSelective(SRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    List<SRole> selectByExample(SRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    SRole selectByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SRole record, @Param("example") SRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SRole record, @Param("example") SRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SRole record);
}