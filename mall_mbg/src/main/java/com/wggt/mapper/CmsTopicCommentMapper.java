package com.wggt.mapper;

import com.wggt.pojo.CmsTopicComment;
import com.wggt.pojo.CmsTopicCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsTopicCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(CmsTopicComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(CmsTopicComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<CmsTopicComment> selectByExample(CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    CmsTopicComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") CmsTopicComment row, @Param("example") CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") CmsTopicComment row, @Param("example") CmsTopicCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(CmsTopicComment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_topic_comment
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(CmsTopicComment row);
}