package com.wggt.pojo;

import java.io.Serializable;

/**
 * Database Table Remarks:
 *   产品分类
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_product_category
 */
public class PmsProductCategory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   上机分类的编号：0表示一级分类
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.parent_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.name
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private String name;

    /**
     * Database Column Remarks:
     *   分类级别：0->1级；1->2级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.level
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.product_count
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Integer productCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.product_unit
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private String productUnit;

    /**
     * Database Column Remarks:
     *   是否显示在导航栏：0->不显示；1->显示
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.nav_status
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Integer navStatus;

    /**
     * Database Column Remarks:
     *   显示状态：0->不显示；1->显示
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.show_status
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Integer showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.sort
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private Integer sort;

    /**
     * Database Column Remarks:
     *   图标
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.icon
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.keywords
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private String keywords;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_category.description
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.id
     *
     * @return the value of pms_product_category.id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.id
     *
     * @param id the value for pms_product_category.id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.parent_id
     *
     * @return the value of pms_product_category.parent_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.parent_id
     *
     * @param parentId the value for pms_product_category.parent_id
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.name
     *
     * @return the value of pms_product_category.name
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.name
     *
     * @param name the value for pms_product_category.name
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.level
     *
     * @return the value of pms_product_category.level
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.level
     *
     * @param level the value for pms_product_category.level
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.product_count
     *
     * @return the value of pms_product_category.product_count
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.product_count
     *
     * @param productCount the value for pms_product_category.product_count
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.product_unit
     *
     * @return the value of pms_product_category.product_unit
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public String getProductUnit() {
        return productUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.product_unit
     *
     * @param productUnit the value for pms_product_category.product_unit
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.nav_status
     *
     * @return the value of pms_product_category.nav_status
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Integer getNavStatus() {
        return navStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.nav_status
     *
     * @param navStatus the value for pms_product_category.nav_status
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.show_status
     *
     * @return the value of pms_product_category.show_status
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.show_status
     *
     * @param showStatus the value for pms_product_category.show_status
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.sort
     *
     * @return the value of pms_product_category.sort
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.sort
     *
     * @param sort the value for pms_product_category.sort
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.icon
     *
     * @return the value of pms_product_category.icon
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.icon
     *
     * @param icon the value for pms_product_category.icon
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.keywords
     *
     * @return the value of pms_product_category.keywords
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.keywords
     *
     * @param keywords the value for pms_product_category.keywords
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_category.description
     *
     * @return the value of pms_product_category.description
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_category.description
     *
     * @param description the value for pms_product_category.description
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
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
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", productCount=").append(productCount);
        sb.append(", productUnit=").append(productUnit);
        sb.append(", navStatus=").append(navStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", icon=").append(icon);
        sb.append(", keywords=").append(keywords);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}