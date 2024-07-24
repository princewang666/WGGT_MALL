/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-07-19 17:20:03
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-07-24 15:34:56
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\controller\UmsMemberController.java
 * @Description: 
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.controller;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.wggt.api.CommonResult;
import com.wggt.mall_framework.dao.Member;
import com.wggt.mall_framework.service.UmsMemberService;

@Tag(name = "ums", description = "会员登录注册管理接口")
@RestController
@RequestMapping("/sso")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    @Operation(
        summary = "生成验证码",
        description = "根据电话号码生成验证码"
    )
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处为验证码"
    )
    @GetMapping("/getAuthCode")
    public CommonResult<String> getList(@Parameter(description = "电话号码", required = true)String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        String authCode = sb.toString();
        // 存入redis
        umsMemberService.save(Member.of(telephone, authCode));
        return CommonResult.success(authCode, "获取验证码成功");
    }

    @Operation(
        summary = "判断验证码是否正确",
        description = "判断电话号码和验证码是否正确"
    )
    @ApiResponse(
        description = "统一返回结果,code代表返回码,message提示信息,data返回数据,此处无"
    )
    @PostMapping("/verifyAuthCode")
    // 参数信息只需声明描述，类结构信息schema和示例会自动生成，且可以生成复合类的
    public CommonResult<?> create(
        @Parameter(description = "电话号码", required = true)String telephone,
        @Parameter(description = "验证码", required = true)String authCode
    ) {
        if (StringUtils.isEmpty(authCode)) {
            return CommonResult.failed("请输入验证码");
        }
        List<Member> members = umsMemberService.findByTelephone(telephone);
        boolean result = authCode.equals(members.get(0).getAuthCode());
        if (result) {
            return CommonResult.success(null, "验证码校验成功");
        } else {
            return CommonResult.failed("验证码不正确");
        }
    }
}
