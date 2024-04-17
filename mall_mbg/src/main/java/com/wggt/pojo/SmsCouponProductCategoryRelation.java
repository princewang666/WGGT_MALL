package com.wggt.pojo;

import java.io.Serializable;

/**
 * Database Table Remarks:
 *   优惠券和产品分类关系表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_coupon_product_category_relation
 */
public class SmsCouponProductCategoryRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_category_relation.id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_category_relation.coupon_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Long couponId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_category_relation.product_category_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Long productCategoryId;

    /**
     * Database Column Remarks:
     *   产品分类名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_category_relation.product_category_name
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private String productCategoryName;

    /**
     * Database Column Remarks:
     *   父分类名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_category_relation.parent_category_name
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private String parentCategoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_category_relation.id
     *
     * @return the value of sms_coupon_product_category_relation.id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_category_relation.id
     *
     * @param id the value for sms_coupon_product_category_relation.id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_category_relation.coupon_id
     *
     * @return the value of sms_coupon_product_category_relation.coupon_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_category_relation.coupon_id
     *
     * @param couponId the value for sms_coupon_product_category_relation.coupon_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_category_relation.product_category_id
     *
     * @return the value of sms_coupon_product_category_relation.product_category_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_category_relation.product_category_id
     *
     * @param productCategoryId the value for sms_coupon_product_category_relation.product_category_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_category_relation.product_category_name
     *
     * @return the value of sms_coupon_product_category_relation.product_category_name
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_category_relation.product_category_name
     *
     * @param productCategoryName the value for sms_coupon_product_category_relation.product_category_name
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_category_relation.parent_category_name
     *
     * @return the value of sms_coupon_product_category_relation.parent_category_name
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public String getParentCategoryName() {
        return parentCategoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_category_relation.parent_category_name
     *
     * @param parentCategoryName the value for sms_coupon_product_category_relation.parent_category_name
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", parentCategoryName=").append(parentCategoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}