/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-18 16:33:39
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-05-21 17:12:20
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\controller\PmsBrandController.java
 * @Description: 商品品牌管理Controllers
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wggt.api.CommonPage;
import com.wggt.api.CommonResult;
import com.wggt.mall_framework.dto.PmsBrandParam;
import com.wggt.mall_framework.service.PmsBrandService;
import com.wggt.pojo.PmsBrand;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
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
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为所有商品品牌"
    )
    // Get 查
    @GetMapping("/listAll")
    public CommonResult<List<PmsBrand>> getList() {
        return CommonResult.success(brandService.listAllBrand());
    }

    @Operation(
        summary = "创建品牌",
        description = "从前端表单创建新品牌"
    )
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为影响行数"
    )
    // Post 增
    @PostMapping("/create")
    // 参数信息只需声明描述，类结构信息schema和示例会自动生成，且可以生成复合类的
    // ? 参数都是自动封装的，无需@RequestBody
    public CommonResult<Integer> create(@Parameter(description = "品牌信息", required = true)PmsBrandParam pmsBrandParam) {
        CommonResult<Integer> commonResult;
        int count = brandService.createBrand(pmsBrandParam);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @Operation(
        summary = "id更新品牌",
        description = "根据id,前端表单更新品牌,注意品牌更新时也要更新商品名称"
    )
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为影响行数"
    )
    // Put 改
    @PutMapping("/update/{id}")
    public CommonResult<Integer> update(
        @Parameter(description = "id", required = true)@PathVariable Long id, 
        @Parameter(description = "品牌信息", required = true)PmsBrandParam pmsBrandParam
    ) {
        CommonResult<Integer> commonResult;
        int count = brandService.updateBrand(id, pmsBrandParam);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @Operation(
        summary = "id删除品牌",
        description = "根据id删除品牌"
    )
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为影响行数"
    )
    // Delete 删
    @DeleteMapping("/delete/{id}")
    public CommonResult<Integer> delete(@Parameter(description = "id", required = true)@PathVariable Long id) {
        CommonResult<Integer> commonResult;
        int count = brandService.deleteBrand(id);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }
    
    @Operation(
        summary = "关键字查询品牌",
        description = "从数据库根据关键字和显示状态查询品牌,分页展示"
    )
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为分页商品品牌"
    )
    @GetMapping("/list")
    public CommonResult<CommonPage<PmsBrand>> getList(
        @Parameter(description = "关键字", required = false)String keyword, 
        @Parameter(description = "展示状态", required = false)Integer showStatus, 
        @Parameter(description = "当前页数")Integer pageNum, 
        @Parameter(description = "页面大小")Integer pageSize
    ) {
        List<PmsBrand> brandList = brandService.listBrand(keyword, showStatus, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @Operation(
        summary = "id查询品牌",
        description = "根据id查询某一特定品牌"
    )
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为某一商品品牌"
    )
    @GetMapping("/{id}")
    public CommonResult<PmsBrand> getItem(@Parameter(description = "id", required = true)@PathVariable Long id) {
        return CommonResult.success(brandService.getBrand(id));
    }

    @Operation(
        summary = "批量删除品牌",
        description = "根据ids删除品牌"
    )
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为影响行数"
    )
    @DeleteMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@Parameter(description = "ids", required = true) List<Long> ids) {
        CommonResult<Integer> commonResult;
        int count = brandService.deleteBrand(ids);
        if (count > 0) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @Operation(
        summary = "批量更新显示状态",
        description = "根据ids批量更新商品显示状态"
    )
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为影响行数"
    )
    @PutMapping("/update/showStatus")
    public CommonResult<Integer> updateShowStatus(
        @Parameter(description = "ids", required = true) List<Long> ids, 
        @Parameter(description = "显示状态", required = true)Integer showStatus
    ) {
        CommonResult<Integer> commonResult;
        int count = brandService.updateShowStatus(ids, showStatus);
        if (count > 0) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @Operation(
        summary = "批量更新厂家状态",
        description = "根据ids批量更新厂家制造商状态"
    )
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为影响行数"
    )
    @PutMapping("/update/factoryStatus")
    public CommonResult<Integer> updateFactoryStatus(
        @Parameter(description = "ids", required = true) List<Long> ids, 
        @Parameter(description = "厂家状态", required = true)Integer factoryStatus
    ) {
        CommonResult<Integer> commonResult;
        int count = brandService.updateFactoryStatus(ids, factoryStatus);
        if (count > 0) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }
}
