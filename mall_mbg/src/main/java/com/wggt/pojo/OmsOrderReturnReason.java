package com.wggt.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   退货原因表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table oms_order_return_reason
 */
public class OmsOrderReturnReason implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_reason.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   退货类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_reason.name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_reason.sort
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer sort;

    /**
     * Database Column Remarks:
     *   状态：0->不启用；1->启用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_reason.status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_reason.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_reason.id
     *
     * @return the value of oms_order_return_reason.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_reason.id
     *
     * @param id the value for oms_order_return_reason.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_reason.name
     *
     * @return the value of oms_order_return_reason.name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_reason.name
     *
     * @param name the value for oms_order_return_reason.name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_reason.sort
     *
     * @return the value of oms_order_return_reason.sort
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_reason.sort
     *
     * @param sort the value for oms_order_return_reason.sort
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_reason.status
     *
     * @return the value of oms_order_return_reason.status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_reason.status
     *
     * @param status the value for oms_order_return_reason.status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_reason.create_time
     *
     * @return the value of oms_order_return_reason.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_reason.create_time
     *
     * @param createTime the value for oms_order_return_reason.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
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
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}