/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-22 16:19:58
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-04-22 16:49:45
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\service\impl\PmsBrandServiceImpl.java
 * @Description: 商品品牌管理Service实现类
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wggt.mall_framework.dto.PmsBrandParam;
import com.wggt.mall_framework.service.PmsBrandService;
import com.wggt.mapper.PmsBrandMapper;
import com.wggt.pojo.PmsBrand;
import com.wggt.pojo.PmsBrandExample;

public class PmsBrandServiceImpl implements PmsBrandService{
    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrandParam pmsBrandParam) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createBrand'");
    }

    @Override
    public int updateBrand(Long id, PmsBrandParam pmsBrandParam) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBrand'");
    }

    @Override
    public int deleteBrand(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBrand'");
    }

    @Override
    public int deleteBrand(List<Long> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBrand'");
    }

    @Override
    public List<PmsBrand> listBrand(String keyword, Integer showStatus, int pageNum, int pageSize) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listBrand'");
    }

    @Override
    public PmsBrand getBrand(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBrand'");
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateShowStatus'");
    }

    @Override
    public int updateFactoryStatus(List<Long> ids, Integer factoryStatus) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateFactoryStatus'");
    }
    
}
