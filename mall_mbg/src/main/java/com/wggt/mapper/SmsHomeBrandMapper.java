package com.wggt.mapper;

import com.wggt.pojo.SmsHomeBrand;
import com.wggt.pojo.SmsHomeBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(SmsHomeBrand row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(SmsHomeBrand row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<SmsHomeBrand> selectByExample(SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    SmsHomeBrand selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") SmsHomeBrand row, @Param("example") SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") SmsHomeBrand row, @Param("example") SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(SmsHomeBrand row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(SmsHomeBrand row);
}