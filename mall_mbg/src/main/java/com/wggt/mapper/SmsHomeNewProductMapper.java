package com.wggt.mapper;

import com.wggt.pojo.SmsHomeNewProduct;
import com.wggt.pojo.SmsHomeNewProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeNewProductMapper {
    long countByExample(SmsHomeNewProductExample example);

    int deleteByExample(SmsHomeNewProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeNewProduct row);

    int insertSelective(SmsHomeNewProduct row);

    List<SmsHomeNewProduct> selectByExample(SmsHomeNewProductExample example);

    SmsHomeNewProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SmsHomeNewProduct row, @Param("example") SmsHomeNewProductExample example);

    int updateByExample(@Param("row") SmsHomeNewProduct row, @Param("example") SmsHomeNewProductExample example);

    int updateByPrimaryKeySelective(SmsHomeNewProduct row);

    int updateByPrimaryKey(SmsHomeNewProduct row);
}