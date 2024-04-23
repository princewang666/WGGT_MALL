/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-18 16:33:39
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-04-23 10:26:47
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\controller\PmsBrandController.java
 * @Description: 商品品牌管理Controllers
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wggt.api.CommonResult;
import com.wggt.mall_framework.service.PmsBrandService;
import com.wggt.pojo.PmsBrand;

// 声明当前类为控制层
@RestController
// 映射请求路径，所有方法会继承类路径
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService brandService;

    @GetMapping("/listAll")
    public CommonResult<List<PmsBrand>> getList() {
        return CommonResult.success(brandService.listAllBrand());
    }
}
