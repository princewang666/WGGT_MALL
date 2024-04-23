package com.wggt.mall_mbg_spring.mapper;

import com.wggt.mall_mbg_spring.pojo.OmsCartItem;
import com.wggt.mall_mbg_spring.pojo.OmsCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsCartItemMapper {
    long countByExample(OmsCartItemExample example);

    int deleteByExample(OmsCartItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsCartItem row);

    int insertSelective(OmsCartItem row);

    List<OmsCartItem> selectByExample(OmsCartItemExample example);

    OmsCartItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OmsCartItem row, @Param("example") OmsCartItemExample example);

    int updateByExample(@Param("row") OmsCartItem row, @Param("example") OmsCartItemExample example);

    int updateByPrimaryKeySelective(OmsCartItem row);

    int updateByPrimaryKey(OmsCartItem row);
}