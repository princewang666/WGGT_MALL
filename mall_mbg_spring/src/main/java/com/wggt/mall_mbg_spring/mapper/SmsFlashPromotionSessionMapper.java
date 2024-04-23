package com.wggt.mall_mbg_spring.mapper;

import com.wggt.mall_mbg_spring.pojo.SmsFlashPromotionSession;
import com.wggt.mall_mbg_spring.pojo.SmsFlashPromotionSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionSessionMapper {
    long countByExample(SmsFlashPromotionSessionExample example);

    int deleteByExample(SmsFlashPromotionSessionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionSession row);

    int insertSelective(SmsFlashPromotionSession row);

    List<SmsFlashPromotionSession> selectByExample(SmsFlashPromotionSessionExample example);

    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SmsFlashPromotionSession row, @Param("example") SmsFlashPromotionSessionExample example);

    int updateByExample(@Param("row") SmsFlashPromotionSession row, @Param("example") SmsFlashPromotionSessionExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotionSession row);

    int updateByPrimaryKey(SmsFlashPromotionSession row);
}