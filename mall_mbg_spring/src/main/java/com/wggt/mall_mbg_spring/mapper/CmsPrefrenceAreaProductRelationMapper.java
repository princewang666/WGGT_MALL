package com.wggt.mall_mbg_spring.mapper;

import com.wggt.mall_mbg_spring.pojo.CmsPrefrenceAreaProductRelation;
import com.wggt.mall_mbg_spring.pojo.CmsPrefrenceAreaProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPrefrenceAreaProductRelationMapper {
    long countByExample(CmsPrefrenceAreaProductRelationExample example);

    int deleteByExample(CmsPrefrenceAreaProductRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceAreaProductRelation row);

    int insertSelective(CmsPrefrenceAreaProductRelation row);

    List<CmsPrefrenceAreaProductRelation> selectByExample(CmsPrefrenceAreaProductRelationExample example);

    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") CmsPrefrenceAreaProductRelation row, @Param("example") CmsPrefrenceAreaProductRelationExample example);

    int updateByExample(@Param("row") CmsPrefrenceAreaProductRelation row, @Param("example") CmsPrefrenceAreaProductRelationExample example);

    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation row);

    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation row);
}