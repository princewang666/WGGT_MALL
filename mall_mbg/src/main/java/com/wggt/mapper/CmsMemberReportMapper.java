package com.wggt.mapper;

import com.wggt.pojo.CmsMemberReport;
import com.wggt.pojo.CmsMemberReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(CmsMemberReport row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(CmsMemberReport row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") CmsMemberReport row, @Param("example") CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") CmsMemberReport row, @Param("example") CmsMemberReportExample example);
}