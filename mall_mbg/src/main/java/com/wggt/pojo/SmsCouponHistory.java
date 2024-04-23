package com.wggt.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   优惠券使用、领取历史表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_coupon_history
 */
public class SmsCouponHistory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.coupon_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long couponId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.member_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.coupon_code
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String couponCode;

    /**
     * Database Column Remarks:
     *   领取人昵称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.member_nickname
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String memberNickname;

    /**
     * Database Column Remarks:
     *   获取类型：0->后台赠送；1->主动获取
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.get_type
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer getType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   使用状态：0->未使用；1->已使用；2->已过期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.use_status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Integer useStatus;

    /**
     * Database Column Remarks:
     *   使用时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.use_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Date useTime;

    /**
     * Database Column Remarks:
     *   订单编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.order_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long orderId;

    /**
     * Database Column Remarks:
     *   订单号码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_history.order_sn
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String orderSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.id
     *
     * @return the value of sms_coupon_history.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.id
     *
     * @param id the value for sms_coupon_history.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.coupon_id
     *
     * @return the value of sms_coupon_history.coupon_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.coupon_id
     *
     * @param couponId the value for sms_coupon_history.coupon_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.member_id
     *
     * @return the value of sms_coupon_history.member_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.member_id
     *
     * @param memberId the value for sms_coupon_history.member_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.coupon_code
     *
     * @return the value of sms_coupon_history.coupon_code
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.coupon_code
     *
     * @param couponCode the value for sms_coupon_history.coupon_code
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.member_nickname
     *
     * @return the value of sms_coupon_history.member_nickname
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getMemberNickname() {
        return memberNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.member_nickname
     *
     * @param memberNickname the value for sms_coupon_history.member_nickname
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.get_type
     *
     * @return the value of sms_coupon_history.get_type
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getGetType() {
        return getType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.get_type
     *
     * @param getType the value for sms_coupon_history.get_type
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setGetType(Integer getType) {
        this.getType = getType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.create_time
     *
     * @return the value of sms_coupon_history.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.create_time
     *
     * @param createTime the value for sms_coupon_history.create_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.use_status
     *
     * @return the value of sms_coupon_history.use_status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Integer getUseStatus() {
        return useStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.use_status
     *
     * @param useStatus the value for sms_coupon_history.use_status
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.use_time
     *
     * @return the value of sms_coupon_history.use_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.use_time
     *
     * @param useTime the value for sms_coupon_history.use_time
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.order_id
     *
     * @return the value of sms_coupon_history.order_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.order_id
     *
     * @param orderId the value for sms_coupon_history.order_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_history.order_sn
     *
     * @return the value of sms_coupon_history.order_sn
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_history.order_sn
     *
     * @param orderSn the value for sms_coupon_history.order_sn
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
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
        sb.append(", couponId=").append(couponId);
        sb.append(", memberId=").append(memberId);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", memberNickname=").append(memberNickname);
        sb.append(", getType=").append(getType);
        sb.append(", createTime=").append(createTime);
        sb.append(", useStatus=").append(useStatus);
        sb.append(", useTime=").append(useTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}