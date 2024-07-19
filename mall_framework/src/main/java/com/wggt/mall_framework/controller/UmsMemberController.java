/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-07-19 17:20:03
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-07-19 17:21:05
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\controller\UmsMemberController.java
 * @Description: 
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

import com.wggt.mall_framework.service.UmsMemberService;

// @Tag为当前Controller命名
@Tag(name = "pms", description = "商品品牌管理接口")
// 声明当前类为控制层，Controller + ResponseBody
@RestController
// 映射请求路径，所有方法会继承类路径
@RequestMapping("/brand")
public class UmsMemberController {
    private UmsMemberService umsMemberService;
}
