package cn.lovemm.model;

import java.util.Date;

public class BlogArticle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.ART_ID
     *
     * @mbggenerated
     */
    private String artId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.ART_NAME
     *
     * @mbggenerated
     */
    private String artName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.ART_SHORT
     *
     * @mbggenerated
     */
    private String artShort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.LAST_MODE_TIME
     *
     * @mbggenerated
     */
    private Date lastModeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.STATUS
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.APPROVE_STATUS
     *
     * @mbggenerated
     */
    private Integer approveStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.USER_ID
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.CORPUS_ID
     *
     * @mbggenerated
     */
    private String corpusId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.READ_TIMES
     *
     * @mbggenerated
     */
    private Integer readTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.COMMENT_TIMES
     *
     * @mbggenerated
     */
    private Integer commentTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.ADMIRE_TIMES
     *
     * @mbggenerated
     */
    private Integer admireTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.PUBLISH_STATUS
     *
     * @mbggenerated
     */
    private Integer publishStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.PUBLISH_TIME
     *
     * @mbggenerated
     */
    private Date publishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.ART_SHORT_PIC
     *
     * @mbggenerated
     */
    private String artShortPic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.EDITOR_TYPE
     *
     * @mbggenerated
     */
    private Integer editorType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.ART_ID
     *
     * @return the value of blog_article.ART_ID
     *
     * @mbggenerated
     */
    public String getArtId() {
        return artId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.ART_ID
     *
     * @param artId the value for blog_article.ART_ID
     *
     * @mbggenerated
     */
    public void setArtId(String artId) {
        this.artId = artId == null ? null : artId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.ART_NAME
     *
     * @return the value of blog_article.ART_NAME
     *
     * @mbggenerated
     */
    public String getArtName() {
        return artName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.ART_NAME
     *
     * @param artName the value for blog_article.ART_NAME
     *
     * @mbggenerated
     */
    public void setArtName(String artName) {
        this.artName = artName == null ? null : artName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.ART_SHORT
     *
     * @return the value of blog_article.ART_SHORT
     *
     * @mbggenerated
     */
    public String getArtShort() {
        return artShort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.ART_SHORT
     *
     * @param artShort the value for blog_article.ART_SHORT
     *
     * @mbggenerated
     */
    public void setArtShort(String artShort) {
        this.artShort = artShort == null ? null : artShort.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.CREATE_TIME
     *
     * @return the value of blog_article.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.CREATE_TIME
     *
     * @param createTime the value for blog_article.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.LAST_MODE_TIME
     *
     * @return the value of blog_article.LAST_MODE_TIME
     *
     * @mbggenerated
     */
    public Date getLastModeTime() {
        return lastModeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.LAST_MODE_TIME
     *
     * @param lastModeTime the value for blog_article.LAST_MODE_TIME
     *
     * @mbggenerated
     */
    public void setLastModeTime(Date lastModeTime) {
        this.lastModeTime = lastModeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.STATUS
     *
     * @return the value of blog_article.STATUS
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.STATUS
     *
     * @param status the value for blog_article.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.APPROVE_STATUS
     *
     * @return the value of blog_article.APPROVE_STATUS
     *
     * @mbggenerated
     */
    public Integer getApproveStatus() {
        return approveStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.APPROVE_STATUS
     *
     * @param approveStatus the value for blog_article.APPROVE_STATUS
     *
     * @mbggenerated
     */
    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.USER_ID
     *
     * @return the value of blog_article.USER_ID
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.USER_ID
     *
     * @param userId the value for blog_article.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.CORPUS_ID
     *
     * @return the value of blog_article.CORPUS_ID
     *
     * @mbggenerated
     */
    public String getCorpusId() {
        return corpusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.CORPUS_ID
     *
     * @param corpusId the value for blog_article.CORPUS_ID
     *
     * @mbggenerated
     */
    public void setCorpusId(String corpusId) {
        this.corpusId = corpusId == null ? null : corpusId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.READ_TIMES
     *
     * @return the value of blog_article.READ_TIMES
     *
     * @mbggenerated
     */
    public Integer getReadTimes() {
        return readTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.READ_TIMES
     *
     * @param readTimes the value for blog_article.READ_TIMES
     *
     * @mbggenerated
     */
    public void setReadTimes(Integer readTimes) {
        this.readTimes = readTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.COMMENT_TIMES
     *
     * @return the value of blog_article.COMMENT_TIMES
     *
     * @mbggenerated
     */
    public Integer getCommentTimes() {
        return commentTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.COMMENT_TIMES
     *
     * @param commentTimes the value for blog_article.COMMENT_TIMES
     *
     * @mbggenerated
     */
    public void setCommentTimes(Integer commentTimes) {
        this.commentTimes = commentTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.ADMIRE_TIMES
     *
     * @return the value of blog_article.ADMIRE_TIMES
     *
     * @mbggenerated
     */
    public Integer getAdmireTimes() {
        return admireTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.ADMIRE_TIMES
     *
     * @param admireTimes the value for blog_article.ADMIRE_TIMES
     *
     * @mbggenerated
     */
    public void setAdmireTimes(Integer admireTimes) {
        this.admireTimes = admireTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.PUBLISH_STATUS
     *
     * @return the value of blog_article.PUBLISH_STATUS
     *
     * @mbggenerated
     */
    public Integer getPublishStatus() {
        return publishStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.PUBLISH_STATUS
     *
     * @param publishStatus the value for blog_article.PUBLISH_STATUS
     *
     * @mbggenerated
     */
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.PUBLISH_TIME
     *
     * @return the value of blog_article.PUBLISH_TIME
     *
     * @mbggenerated
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.PUBLISH_TIME
     *
     * @param publishTime the value for blog_article.PUBLISH_TIME
     *
     * @mbggenerated
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.ART_SHORT_PIC
     *
     * @return the value of blog_article.ART_SHORT_PIC
     *
     * @mbggenerated
     */
    public String getArtShortPic() {
        return artShortPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.ART_SHORT_PIC
     *
     * @param artShortPic the value for blog_article.ART_SHORT_PIC
     *
     * @mbggenerated
     */
    public void setArtShortPic(String artShortPic) {
        this.artShortPic = artShortPic == null ? null : artShortPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.EDITOR_TYPE
     *
     * @return the value of blog_article.EDITOR_TYPE
     *
     * @mbggenerated
     */
    public Integer getEditorType() {
        return editorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.EDITOR_TYPE
     *
     * @param editorType the value for blog_article.EDITOR_TYPE
     *
     * @mbggenerated
     */
    public void setEditorType(Integer editorType) {
        this.editorType = editorType;
    }
}