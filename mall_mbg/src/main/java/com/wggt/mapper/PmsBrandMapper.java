package com.wggt.mapper;

import com.wggt.pojo.PmsBrand;
import com.wggt.pojo.PmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(PmsBrand row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(PmsBrand row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<PmsBrand> selectByExampleWithBLOBs(PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<PmsBrand> selectByExample(PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    PmsBrand selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") PmsBrand row, @Param("example") PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleWithBLOBs(@Param("row") PmsBrand row, @Param("example") PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") PmsBrand row, @Param("example") PmsBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(PmsBrand row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(PmsBrand row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_brand
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(PmsBrand row);
}