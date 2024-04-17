package com.wggt.mapper;

import com.wggt.pojo.CmsSubject;
import com.wggt.pojo.CmsSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    long countByExample(CmsSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByExample(CmsSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insert(CmsSubject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insertSelective(CmsSubject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    List<CmsSubject> selectByExampleWithBLOBs(CmsSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    List<CmsSubject> selectByExample(CmsSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    CmsSubject selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExampleSelective(@Param("row") CmsSubject row, @Param("example") CmsSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExampleWithBLOBs(@Param("row") CmsSubject row, @Param("example") CmsSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExample(@Param("row") CmsSubject row, @Param("example") CmsSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKeySelective(CmsSubject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(CmsSubject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKey(CmsSubject row);
}