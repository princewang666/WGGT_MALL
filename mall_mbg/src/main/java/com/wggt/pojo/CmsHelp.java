package com.wggt.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   帮助表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_help
 */
public class CmsHelp implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_help.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_help.category_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_help.icon
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_help.title
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_help.show_status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_help.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_help.read_count
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer readCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_help.content
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_help
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_help.id
     *
     * @return the value of cms_help.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_help.id
     *
     * @param id the value for cms_help.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_help.category_id
     *
     * @return the value of cms_help.category_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_help.category_id
     *
     * @param categoryId the value for cms_help.category_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_help.icon
     *
     * @return the value of cms_help.icon
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_help.icon
     *
     * @param icon the value for cms_help.icon
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_help.title
     *
     * @return the value of cms_help.title
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_help.title
     *
     * @param title the value for cms_help.title
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_help.show_status
     *
     * @return the value of cms_help.show_status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_help.show_status
     *
     * @param showStatus the value for cms_help.show_status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_help.create_time
     *
     * @return the value of cms_help.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_help.create_time
     *
     * @param createTime the value for cms_help.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_help.read_count
     *
     * @return the value of cms_help.read_count
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_help.read_count
     *
     * @param readCount the value for cms_help.read_count
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_help.content
     *
     * @return the value of cms_help.content
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_help.content
     *
     * @param content the value for cms_help.content
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", icon=").append(icon);
        sb.append(", title=").append(title);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", readCount=").append(readCount);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}