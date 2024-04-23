/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-23 10:09:14
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-04-23 10:10:07
 * @FilePath: \WGGT_MALL\mall_common\src\main\java\com\wggt\api\IErrorCode.java
 * @Description: API返回码接口
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.api;

public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();
    /**
     * 返回信息
     */
    String getMessage();
}
