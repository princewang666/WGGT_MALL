package com.wggt.mall_mbg_spring.mapper;

import com.wggt.mall_mbg_spring.pojo.PmsProduct;
import com.wggt.mall_mbg_spring.pojo.PmsProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductMapper {
    long countByExample(PmsProductExample example);

    int deleteByExample(PmsProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProduct row);

    int insertSelective(PmsProduct row);

    List<PmsProduct> selectByExampleWithBLOBs(PmsProductExample example);

    List<PmsProduct> selectByExample(PmsProductExample example);

    PmsProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsProduct row, @Param("example") PmsProductExample example);

    int updateByExampleWithBLOBs(@Param("row") PmsProduct row, @Param("example") PmsProductExample example);

    int updateByExample(@Param("row") PmsProduct row, @Param("example") PmsProductExample example);

    int updateByPrimaryKeySelective(PmsProduct row);

    int updateByPrimaryKeyWithBLOBs(PmsProduct row);

    int updateByPrimaryKey(PmsProduct row);
}