package com.wggt.mapper;

import com.wggt.pojo.SmsHomeAdvertise;
import com.wggt.pojo.SmsHomeAdvertiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeAdvertiseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(SmsHomeAdvertise row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(SmsHomeAdvertise row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<SmsHomeAdvertise> selectByExample(SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    SmsHomeAdvertise selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") SmsHomeAdvertise row, @Param("example") SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") SmsHomeAdvertise row, @Param("example") SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(SmsHomeAdvertise row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(SmsHomeAdvertise row);
}