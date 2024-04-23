/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-22 15:35:12
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-04-23 11:00:55
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\service\PmsBrandService.java
 * @Description: 商品品牌管理Service接口
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.service;

import java.util.List;

import com.wggt.mall_framework.dto.PmsBrandParam;
import com.wggt.mall_mbg_spring.pojo.PmsBrand;

public interface PmsBrandService {
    /**
     * 获取所有品牌
     * @return List封装的品牌列表
     */
    List<PmsBrand> listAllBrand();
    /**
     * 创建品牌
     * @param pmsBrandParam 前端传入参数
     * @return 结果
     */
    int createBrand(PmsBrandParam pmsBrandParam);
    /**
     * 根据id更新品牌
     * @param id 品牌id
     * @param pmsBrandParam 前端传入参数
     * @return 结果
     */
    int updateBrand(Long id, PmsBrandParam pmsBrandParam);
    /**
     * 根据id删除品牌
     * @param id 品牌id
     * @return 结果
     */
    int deleteBrand(Long id);
    /**
     * 根据id批量删除品牌
     * @param ids List封装品牌id
     * @return 结果
     */
    int deleteBrand(List<Long> ids);
    /**
     * 分页查询品牌
     * @param keyword 关键字
     * @param showStatus 展示状态
     * @param pageNum 分页数
     * @param pageSize 页面大小
     * @return 当前页的所有品牌
     */
    List<PmsBrand> listBrand(String keyword, Integer showStatus, int pageNum, int pageSize);
    /**
     * 根据id查询某一品牌
     * @param id 品牌id
     * @return 查询到的品牌
     */
    PmsBrand getBrand(Long id);
    /**
     * 修改显示状态
     * @param ids List封装品牌id
     * @param showStatus 显示状态
     * @return 结果
     */ 
    int updateShowStatus(List<Long> ids, Integer showStatus);
    /**
     * 修改厂家制造商状态
     * @param ids List封装品牌id
     * @param factoryStatus 厂家制造商状态
     * @return 结果
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
