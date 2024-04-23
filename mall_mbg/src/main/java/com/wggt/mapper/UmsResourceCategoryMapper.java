package com.wggt.mapper;

import com.wggt.pojo.UmsResourceCategory;
import com.wggt.pojo.UmsResourceCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsResourceCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(UmsResourceCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(UmsResourceCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<UmsResourceCategory> selectByExample(UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    UmsResourceCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") UmsResourceCategory row, @Param("example") UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") UmsResourceCategory row, @Param("example") UmsResourceCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(UmsResourceCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_resource_category
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(UmsResourceCategory row);
}