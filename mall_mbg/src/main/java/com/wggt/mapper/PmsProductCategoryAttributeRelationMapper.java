package com.wggt.mapper;

import com.wggt.pojo.PmsProductCategoryAttributeRelation;
import com.wggt.pojo.PmsProductCategoryAttributeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryAttributeRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(PmsProductCategoryAttributeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(PmsProductCategoryAttributeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(PmsProductCategoryAttributeRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(PmsProductCategoryAttributeRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<PmsProductCategoryAttributeRelation> selectByExample(PmsProductCategoryAttributeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") PmsProductCategoryAttributeRelation row, @Param("example") PmsProductCategoryAttributeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") PmsProductCategoryAttributeRelation row, @Param("example") PmsProductCategoryAttributeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category_attribute_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(PmsProductCategoryAttributeRelation row);
}