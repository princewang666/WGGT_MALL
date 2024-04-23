package com.wggt.mapper;

import com.wggt.pojo.UmsMemberReceiveAddress;
import com.wggt.pojo.UmsMemberReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberReceiveAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(UmsMemberReceiveAddress row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(UmsMemberReceiveAddress row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<UmsMemberReceiveAddress> selectByExample(UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") UmsMemberReceiveAddress row, @Param("example") UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") UmsMemberReceiveAddress row, @Param("example") UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(UmsMemberReceiveAddress row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(UmsMemberReceiveAddress row);
}