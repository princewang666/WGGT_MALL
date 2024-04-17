package com.wggt.mapper;

import com.wggt.pojo.PmsProductCategory;
import com.wggt.pojo.PmsProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    long countByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insert(PmsProductCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insertSelective(PmsProductCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    List<PmsProductCategory> selectByExampleWithBLOBs(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    List<PmsProductCategory> selectByExample(PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    PmsProductCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExampleSelective(@Param("row") PmsProductCategory row, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExampleWithBLOBs(@Param("row") PmsProductCategory row, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExample(@Param("row") PmsProductCategory row, @Param("example") PmsProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKeySelective(PmsProductCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(PmsProductCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKey(PmsProductCategory row);
}