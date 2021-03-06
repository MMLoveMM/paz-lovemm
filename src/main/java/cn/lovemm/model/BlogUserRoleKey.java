package cn.lovemm.model;

public class BlogUserRoleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_user_role.USER_ID
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_user_role.ROLE_ID
     *
     * @mbggenerated
     */
    private String roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_user_role.USER_ID
     *
     * @return the value of blog_user_role.USER_ID
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_user_role.USER_ID
     *
     * @param userId the value for blog_user_role.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_user_role.ROLE_ID
     *
     * @return the value of blog_user_role.ROLE_ID
     *
     * @mbggenerated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_user_role.ROLE_ID
     *
     * @param roleId the value for blog_user_role.ROLE_ID
     *
     * @mbggenerated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}