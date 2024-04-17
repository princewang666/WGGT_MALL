package com.wggt.mapper;

import com.wggt.pojo.CmsSubjectCategory;
import com.wggt.pojo.CmsSubjectCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    long countByExample(CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByExample(CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insert(CmsSubjectCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insertSelective(CmsSubjectCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    List<CmsSubjectCategory> selectByExample(CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    CmsSubjectCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExampleSelective(@Param("row") CmsSubjectCategory row, @Param("example") CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExample(@Param("row") CmsSubjectCategory row, @Param("example") CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKeySelective(CmsSubjectCategory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKey(CmsSubjectCategory row);
}