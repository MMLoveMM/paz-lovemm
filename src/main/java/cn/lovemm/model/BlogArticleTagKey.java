package cn.lovemm.model;

public class BlogArticleTagKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article_tag.ART_ID
     *
     * @mbggenerated
     */
    private String artId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article_tag.TAG_ID
     *
     * @mbggenerated
     */
    private String tagId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article_tag.ART_ID
     *
     * @return the value of blog_article_tag.ART_ID
     *
     * @mbggenerated
     */
    public String getArtId() {
        return artId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article_tag.ART_ID
     *
     * @param artId the value for blog_article_tag.ART_ID
     *
     * @mbggenerated
     */
    public void setArtId(String artId) {
        this.artId = artId == null ? null : artId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article_tag.TAG_ID
     *
     * @return the value of blog_article_tag.TAG_ID
     *
     * @mbggenerated
     */
    public String getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article_tag.TAG_ID
     *
     * @param tagId the value for blog_article_tag.TAG_ID
     *
     * @mbggenerated
     */
    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }
}