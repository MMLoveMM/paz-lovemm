package cn.lovemm.model;

public class SDataDicKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_data_dic.DIC_GROUP
     *
     * @mbggenerated
     */
    private String dicGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_data_dic.DIC_KEY
     *
     * @mbggenerated
     */
    private String dicKey;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_data_dic.DIC_GROUP
     *
     * @return the value of s_data_dic.DIC_GROUP
     *
     * @mbggenerated
     */
    public String getDicGroup() {
        return dicGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_data_dic.DIC_GROUP
     *
     * @param dicGroup the value for s_data_dic.DIC_GROUP
     *
     * @mbggenerated
     */
    public void setDicGroup(String dicGroup) {
        this.dicGroup = dicGroup == null ? null : dicGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_data_dic.DIC_KEY
     *
     * @return the value of s_data_dic.DIC_KEY
     *
     * @mbggenerated
     */
    public String getDicKey() {
        return dicKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_data_dic.DIC_KEY
     *
     * @param dicKey the value for s_data_dic.DIC_KEY
     *
     * @mbggenerated
     */
    public void setDicKey(String dicKey) {
        this.dicKey = dicKey == null ? null : dicKey.trim();
    }
}