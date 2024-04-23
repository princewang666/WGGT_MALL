package com.wggt.mapper;

import com.wggt.pojo.SmsHomeRecommendSubject;
import com.wggt.pojo.SmsHomeRecommendSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeRecommendSubjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(SmsHomeRecommendSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(SmsHomeRecommendSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(SmsHomeRecommendSubject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(SmsHomeRecommendSubject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<SmsHomeRecommendSubject> selectByExample(SmsHomeRecommendSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    SmsHomeRecommendSubject selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") SmsHomeRecommendSubject row, @Param("example") SmsHomeRecommendSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") SmsHomeRecommendSubject row, @Param("example") SmsHomeRecommendSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(SmsHomeRecommendSubject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_subject
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(SmsHomeRecommendSubject row);
}