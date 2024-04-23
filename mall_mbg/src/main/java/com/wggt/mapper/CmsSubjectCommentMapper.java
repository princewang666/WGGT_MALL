package com.wggt.mapper;

import com.wggt.pojo.CmsSubjectComment;
import com.wggt.pojo.CmsSubjectCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(CmsSubjectComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(CmsSubjectComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<CmsSubjectComment> selectByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    CmsSubjectComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") CmsSubjectComment row, @Param("example") CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") CmsSubjectComment row, @Param("example") CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(CmsSubjectComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(CmsSubjectComment row);
}