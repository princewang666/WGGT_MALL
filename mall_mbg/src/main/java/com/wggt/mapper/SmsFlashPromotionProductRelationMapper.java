package com.wggt.mapper;

import com.wggt.pojo.SmsFlashPromotionProductRelation;
import com.wggt.pojo.SmsFlashPromotionProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionProductRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(SmsFlashPromotionProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(SmsFlashPromotionProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(SmsFlashPromotionProductRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(SmsFlashPromotionProductRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<SmsFlashPromotionProductRelation> selectByExample(SmsFlashPromotionProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") SmsFlashPromotionProductRelation row, @Param("example") SmsFlashPromotionProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") SmsFlashPromotionProductRelation row, @Param("example") SmsFlashPromotionProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(SmsFlashPromotionProductRelation row);
}