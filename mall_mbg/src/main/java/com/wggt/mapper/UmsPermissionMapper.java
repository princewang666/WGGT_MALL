package com.wggt.mapper;

import com.wggt.pojo.UmsPermission;
import com.wggt.pojo.UmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    long countByExample(UmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByExample(UmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insert(UmsPermission row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int insertSelective(UmsPermission row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    List<UmsPermission> selectByExample(UmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    UmsPermission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExampleSelective(@Param("row") UmsPermission row, @Param("example") UmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByExample(@Param("row") UmsPermission row, @Param("example") UmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKeySelective(UmsPermission row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_permission
     *
     * @mbg.generated Tue Apr 23 10:55:49 CST 2024
     */
    int updateByPrimaryKey(UmsPermission row);
}