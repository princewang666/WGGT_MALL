package com.wggt.mapper;

import com.wggt.pojo.SmsHomeRecommendProduct;
import com.wggt.pojo.SmsHomeRecommendProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeRecommendProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    long countByExample(SmsHomeRecommendProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByExample(SmsHomeRecommendProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insert(SmsHomeRecommendProduct row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insertSelective(SmsHomeRecommendProduct row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    List<SmsHomeRecommendProduct> selectByExample(SmsHomeRecommendProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExampleSelective(@Param("row") SmsHomeRecommendProduct row, @Param("example") SmsHomeRecommendProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExample(@Param("row") SmsHomeRecommendProduct row, @Param("example") SmsHomeRecommendProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKeySelective(SmsHomeRecommendProduct row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKey(SmsHomeRecommendProduct row);
}