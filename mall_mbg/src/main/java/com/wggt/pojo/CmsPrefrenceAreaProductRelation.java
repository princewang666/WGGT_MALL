package com.wggt.pojo;

import java.io.Serializable;

/**
 * Database Table Remarks:
 *   优选专区和产品关系表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_prefrence_area_product_relation
 */
public class CmsPrefrenceAreaProductRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area_product_relation.id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area_product_relation.prefrence_area_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Long prefrenceAreaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area_product_relation.product_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Long productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area_product_relation.id
     *
     * @return the value of cms_prefrence_area_product_relation.id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area_product_relation.id
     *
     * @param id the value for cms_prefrence_area_product_relation.id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area_product_relation.prefrence_area_id
     *
     * @return the value of cms_prefrence_area_product_relation.prefrence_area_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Long getPrefrenceAreaId() {
        return prefrenceAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area_product_relation.prefrence_area_id
     *
     * @param prefrenceAreaId the value for cms_prefrence_area_product_relation.prefrence_area_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setPrefrenceAreaId(Long prefrenceAreaId) {
        this.prefrenceAreaId = prefrenceAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area_product_relation.product_id
     *
     * @return the value of cms_prefrence_area_product_relation.product_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area_product_relation.product_id
     *
     * @param productId the value for cms_prefrence_area_product_relation.product_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
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
        sb.append(", prefrenceAreaId=").append(prefrenceAreaId);
        sb.append(", productId=").append(productId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}