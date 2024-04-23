package com.wggt.mapper;

import com.wggt.pojo.PmsProductVertifyRecord;
import com.wggt.pojo.PmsProductVertifyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductVertifyRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(PmsProductVertifyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(PmsProductVertifyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(PmsProductVertifyRecord row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(PmsProductVertifyRecord row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<PmsProductVertifyRecord> selectByExample(PmsProductVertifyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") PmsProductVertifyRecord row, @Param("example") PmsProductVertifyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") PmsProductVertifyRecord row, @Param("example") PmsProductVertifyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(PmsProductVertifyRecord row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_vertify_record
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(PmsProductVertifyRecord row);
}