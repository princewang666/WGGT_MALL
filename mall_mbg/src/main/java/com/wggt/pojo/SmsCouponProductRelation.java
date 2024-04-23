package com.wggt.pojo;

import java.io.Serializable;

/**
 * Database Table Remarks:
 *   优惠券和产品的关系表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_coupon_product_relation
 */
public class SmsCouponProductRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_relation.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_relation.coupon_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long couponId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_relation.product_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private Long productId;

    /**
     * Database Column Remarks:
     *   商品名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_relation.product_name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String productName;

    /**
     * Database Column Remarks:
     *   商品编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_relation.product_sn
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private String productSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_coupon_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_relation.id
     *
     * @return the value of sms_coupon_product_relation.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_relation.id
     *
     * @param id the value for sms_coupon_product_relation.id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_relation.coupon_id
     *
     * @return the value of sms_coupon_product_relation.coupon_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_relation.coupon_id
     *
     * @param couponId the value for sms_coupon_product_relation.coupon_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_relation.product_id
     *
     * @return the value of sms_coupon_product_relation.product_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_relation.product_id
     *
     * @param productId the value for sms_coupon_product_relation.product_id
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_relation.product_name
     *
     * @return the value of sms_coupon_product_relation.product_name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_relation.product_name
     *
     * @param productName the value for sms_coupon_product_relation.product_name
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_relation.product_sn
     *
     * @return the value of sms_coupon_product_relation.product_sn
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_relation.product_sn
     *
     * @param productSn the value for sms_coupon_product_relation.product_sn
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_relation
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
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", productSn=").append(productSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}