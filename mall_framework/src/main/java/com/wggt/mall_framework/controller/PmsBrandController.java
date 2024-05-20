/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-18 16:33:39
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-05-20 11:41:08
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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

// @Tag为当前Controller命名
@Tag(name = "pms", description = "商品品牌管理接口")
// 声明当前类为控制层，Controller + ResponseBody
@RestController
// 映射请求路径，所有方法会继承类路径
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService brandService;

    // 详细描述当前API操作信息，可用tags将其划分到别的组
    @Operation(
        summary = "获取所有品牌",
        description = "从数据库查询获得所有品牌"
    )
    // 接口调用返回信息，@ApiResponses可以返回多个返回码情况，但本项目用的统一返回结果CommonResult，因此不需要
    // 只需声明描述，类结构信息schema和示例会自动生成，且可以生成复合类的
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为商品品牌"
    )
    
    @GetMapping("/listAll")
    public CommonResult<List<PmsBrand>> getList() {
        return CommonResult.success(brandService.listAllBrand());
    }
}
