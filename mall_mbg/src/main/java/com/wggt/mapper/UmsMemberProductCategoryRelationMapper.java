package com.wggt.mapper;

import com.wggt.pojo.UmsMemberProductCategoryRelation;
import com.wggt.pojo.UmsMemberProductCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberProductCategoryRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    long countByExample(UmsMemberProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByExample(UmsMemberProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insert(UmsMemberProductCategoryRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insertSelective(UmsMemberProductCategoryRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    List<UmsMemberProductCategoryRelation> selectByExample(UmsMemberProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    UmsMemberProductCategoryRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExampleSelective(@Param("row") UmsMemberProductCategoryRelation row, @Param("example") UmsMemberProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExample(@Param("row") UmsMemberProductCategoryRelation row, @Param("example") UmsMemberProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_product_category_relation
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKey(UmsMemberProductCategoryRelation row);
}