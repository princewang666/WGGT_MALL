package com.wggt.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   后台用户角色表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_role
 */
public class UmsRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String name;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.description
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String description;

    /**
     * Database Column Remarks:
     *   后台用户数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.admin_count
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer adminCount;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   启用状态：0->禁用；1->启用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_role.sort
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_role
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.id
     *
     * @return the value of ums_role.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.id
     *
     * @param id the value for ums_role.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.name
     *
     * @return the value of ums_role.name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.name
     *
     * @param name the value for ums_role.name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.description
     *
     * @return the value of ums_role.description
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.description
     *
     * @param description the value for ums_role.description
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.admin_count
     *
     * @return the value of ums_role.admin_count
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getAdminCount() {
        return adminCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.admin_count
     *
     * @param adminCount the value for ums_role.admin_count
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setAdminCount(Integer adminCount) {
        this.adminCount = adminCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.create_time
     *
     * @return the value of ums_role.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.create_time
     *
     * @param createTime the value for ums_role.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.status
     *
     * @return the value of ums_role.status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.status
     *
     * @param status the value for ums_role.status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.sort
     *
     * @return the value of ums_role.sort
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.sort
     *
     * @param sort the value for ums_role.sort
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
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
        sb.append(", description=").append(description);
        sb.append(", adminCount=").append(adminCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}