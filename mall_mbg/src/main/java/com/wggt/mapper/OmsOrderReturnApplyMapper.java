package com.wggt.mapper;

import com.wggt.pojo.OmsOrderReturnApply;
import com.wggt.pojo.OmsOrderReturnApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderReturnApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    long countByExample(OmsOrderReturnApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByExample(OmsOrderReturnApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insert(OmsOrderReturnApply row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int insertSelective(OmsOrderReturnApply row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    List<OmsOrderReturnApply> selectByExample(OmsOrderReturnApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    OmsOrderReturnApply selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExampleSelective(@Param("row") OmsOrderReturnApply row, @Param("example") OmsOrderReturnApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByExample(@Param("row") OmsOrderReturnApply row, @Param("example") OmsOrderReturnApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKeySelective(OmsOrderReturnApply row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated Wed Apr 17 17:17:23 CST 2024
     */
    int updateByPrimaryKey(OmsOrderReturnApply row);
}