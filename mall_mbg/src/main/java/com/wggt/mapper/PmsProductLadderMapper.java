package com.wggt.mapper;

import com.wggt.pojo.PmsProductLadder;
import com.wggt.pojo.PmsProductLadderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductLadderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(PmsProductLadderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(PmsProductLadderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(PmsProductLadder row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(PmsProductLadder row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<PmsProductLadder> selectByExample(PmsProductLadderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    PmsProductLadder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") PmsProductLadder row, @Param("example") PmsProductLadderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") PmsProductLadder row, @Param("example") PmsProductLadderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(PmsProductLadder row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(PmsProductLadder row);
}