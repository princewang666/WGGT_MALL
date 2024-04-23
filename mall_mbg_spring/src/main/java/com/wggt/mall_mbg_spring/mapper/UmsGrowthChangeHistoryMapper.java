package com.wggt.mall_mbg_spring.mapper;

import com.wggt.mall_mbg_spring.pojo.UmsGrowthChangeHistory;
import com.wggt.mall_mbg_spring.pojo.UmsGrowthChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsGrowthChangeHistoryMapper {
    long countByExample(UmsGrowthChangeHistoryExample example);

    int deleteByExample(UmsGrowthChangeHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsGrowthChangeHistory row);

    int insertSelective(UmsGrowthChangeHistory row);

    List<UmsGrowthChangeHistory> selectByExample(UmsGrowthChangeHistoryExample example);

    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsGrowthChangeHistory row, @Param("example") UmsGrowthChangeHistoryExample example);

    int updateByExample(@Param("row") UmsGrowthChangeHistory row, @Param("example") UmsGrowthChangeHistoryExample example);

    int updateByPrimaryKeySelective(UmsGrowthChangeHistory row);

    int updateByPrimaryKey(UmsGrowthChangeHistory row);
}