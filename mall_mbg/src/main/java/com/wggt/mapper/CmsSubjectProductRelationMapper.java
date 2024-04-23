package com.wggt.mapper;

import com.wggt.pojo.CmsSubjectProductRelation;
import com.wggt.pojo.CmsSubjectProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectProductRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(CmsSubjectProductRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(CmsSubjectProductRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<CmsSubjectProductRelation> selectByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") CmsSubjectProductRelation row, @Param("example") CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") CmsSubjectProductRelation row, @Param("example") CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(CmsSubjectProductRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(CmsSubjectProductRelation row);
}