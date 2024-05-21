/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-22 16:19:58
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-05-21 10:55:32
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\service\impl\PmsBrandServiceImpl.java
 * @Description: 商品品牌管理Service实现类
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.wggt.mall_framework.dto.PmsBrandParam;
import com.wggt.mall_framework.service.PmsBrandService;
import com.wggt.mapper.PmsBrandMapper;
import com.wggt.mapper.PmsProductMapper;
import com.wggt.pojo.PmsBrand;
import com.wggt.pojo.PmsBrandExample;
import com.wggt.pojo.PmsProduct;
import com.wggt.pojo.PmsProductExample;

import cn.hutool.core.util.StrUtil;

@Service
public class PmsBrandServiceImpl implements PmsBrandService{
    @Autowired
    private PmsBrandMapper pmsBrandMapper;
    @Autowired
    private PmsProductMapper pmsProductMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrandParam pmsBrandParam) {
        // 将前端参数传入数据库pojo
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandParam, pmsBrand);
        // 判断是否有FirstLetter，没有取名称首字母
        if (StrUtil.isEmpty(pmsBrand.getFirstLetter())) {
            pmsBrand.setFirstLetter(pmsBrand.getName().substring(0, 1));
        }
        return pmsBrandMapper.insertSelective(pmsBrand);
    }

    @Override
    public int updateBrand(Long id, PmsBrandParam pmsBrandParam) {
        // 将前端参数传入数据库pojo
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandParam, pmsBrand);
        pmsBrand.setId(id);
        // 判断是否有FirstLetter，没有取名称首字母
        if (StrUtil.isEmpty(pmsBrand.getFirstLetter())) {
            pmsBrand.setFirstLetter(pmsBrand.getName().substring(0, 1));
        }
        // 更新品牌时也要更新商品中的名称(关联数据库)
        PmsProduct product = new PmsProduct();
        product.setBrandName(pmsBrand.getName());
        // 实体类Example用于方便查询，https://blog.csdn.net/GluttonK/article/details/118254954
        PmsProductExample example = new PmsProductExample();
        // 设置查询条件
        example.createCriteria().andBrandIdEqualTo(id);
        pmsProductMapper.updateByExampleSelective(product, example);
        return pmsBrandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteBrand(List<Long> ids) {
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        pmsBrandExample.createCriteria().andIdIn(ids);
        return pmsBrandMapper.deleteByExample(pmsBrandExample);
    }

    @Override
    public List<PmsBrand> listBrand(String keyword, Integer showStatus, int pageNum, int pageSize) {
        // 获取第pageNum页，pageSize条内容，对紧跟着的MyBatis执行分页
        PageHelper.startPage(pageNum, pageSize);
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        // 降序排列
        pmsBrandExample.setOrderByClause("sort desc");
        // 设置查询条件
        PmsBrandExample.Criteria criteria = pmsBrandExample.createCriteria();
        // 关键字不为空添加模糊查询
        if (!StrUtil.isEmpty(keyword)) {
            criteria.andNameLike("%" + keyword + "%");
        }
        // 展示状态不为空添加精准匹配查询
        if (showStatus != null) {
            criteria.andShowStatusEqualTo(showStatus);
        }
        return pmsBrandMapper.selectByExample(pmsBrandExample);
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setShowStatus(showStatus);
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        pmsBrandExample.createCriteria().andIdIn(ids);
        return pmsBrandMapper.updateByExampleSelective(pmsBrand, pmsBrandExample);
    }

    @Override
    public int updateFactoryStatus(List<Long> ids, Integer factoryStatus) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setFactoryStatus(factoryStatus);
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        pmsBrandExample.createCriteria().andIdIn(ids);
        return pmsBrandMapper.updateByExampleSelective(pmsBrand, pmsBrandExample);
    }
    
}
