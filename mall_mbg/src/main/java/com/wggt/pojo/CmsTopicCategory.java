package com.wggt.pojo;

import java.io.Serializable;

/**
 * Database Table Remarks:
 *   话题分类表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_topic_category
 */
public class CmsTopicCategory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic_category.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic_category.name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String name;

    /**
     * Database Column Remarks:
     *   分类图标
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic_category.icon
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String icon;

    /**
     * Database Column Remarks:
     *   专题数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic_category.subject_count
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer subjectCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic_category.show_status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_topic_category.sort
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_topic_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic_category.id
     *
     * @return the value of cms_topic_category.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic_category.id
     *
     * @param id the value for cms_topic_category.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic_category.name
     *
     * @return the value of cms_topic_category.name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic_category.name
     *
     * @param name the value for cms_topic_category.name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic_category.icon
     *
     * @return the value of cms_topic_category.icon
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic_category.icon
     *
     * @param icon the value for cms_topic_category.icon
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic_category.subject_count
     *
     * @return the value of cms_topic_category.subject_count
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getSubjectCount() {
        return subjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic_category.subject_count
     *
     * @param subjectCount the value for cms_topic_category.subject_count
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setSubjectCount(Integer subjectCount) {
        this.subjectCount = subjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic_category.show_status
     *
     * @return the value of cms_topic_category.show_status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic_category.show_status
     *
     * @param showStatus the value for cms_topic_category.show_status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_topic_category.sort
     *
     * @return the value of cms_topic_category.sort
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_topic_category.sort
     *
     * @param sort the value for cms_topic_category.sort
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_category
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
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", subjectCount=").append(subjectCount);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}