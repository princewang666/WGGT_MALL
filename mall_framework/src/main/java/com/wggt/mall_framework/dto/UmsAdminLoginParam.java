/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-07-30 15:11:14
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-07-30 15:22:30
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\dto\UmsAdminLoginParam.java
 * @Description: 用户登录参数类
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;

@Data
@Schema(description = "用户登录参数类")
public class UmsAdminLoginParam {
    @Schema(description = "用户名", example = "wggt", requiredMode = RequiredMode.REQUIRED)
    private String username;
    @Schema(description = "密码", example = "8888", requiredMode = RequiredMode.REQUIRED)
    private String password;
}
