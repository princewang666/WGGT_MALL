package com.wggt.mapper;

import com.wggt.pojo.UmsIntegrationConsumeSetting;
import com.wggt.pojo.UmsIntegrationConsumeSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsIntegrationConsumeSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(UmsIntegrationConsumeSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(UmsIntegrationConsumeSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(UmsIntegrationConsumeSetting row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(UmsIntegrationConsumeSetting row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<UmsIntegrationConsumeSetting> selectByExample(UmsIntegrationConsumeSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") UmsIntegrationConsumeSetting row, @Param("example") UmsIntegrationConsumeSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") UmsIntegrationConsumeSetting row, @Param("example") UmsIntegrationConsumeSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(UmsIntegrationConsumeSetting row);
}