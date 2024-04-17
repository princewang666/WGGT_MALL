package com.wggt.mapper;

import com.wggt.pojo.UmsGrowthChangeHistory;
import com.wggt.pojo.UmsGrowthChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsGrowthChangeHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    long countByExample(UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByExample(UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insert(UmsGrowthChangeHistory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insertSelective(UmsGrowthChangeHistory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    List<UmsGrowthChangeHistory> selectByExample(UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExampleSelective(@Param("row") UmsGrowthChangeHistory row, @Param("example") UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExample(@Param("row") UmsGrowthChangeHistory row, @Param("example") UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKeySelective(UmsGrowthChangeHistory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKey(UmsGrowthChangeHistory row);
}