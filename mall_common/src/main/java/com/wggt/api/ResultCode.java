/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-23 10:11:07
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-04-23 10:17:39
 * @FilePath: \WGGT_MALL\mall_common\src\main\java\com\wggt\api\ResultCode.java
 * @Description: API返回码封装类
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.api;

public enum ResultCode implements IErrorCode{
    // 枚举类型状态码
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");

    // 状态信息 
    private long code;
    private String message;

    // 构造函数
    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
    
}
