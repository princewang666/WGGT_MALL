/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-07-19 10:54:46
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-07-19 17:03:53
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\dao\Member.java
 * @Description: Redis存储类
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.dao;

import org.springframework.data.annotation.Id;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
// import com.redis.om.spring.annotations.Searchable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// 声明为redisJSON对象，会分配下标给该类
@Document
@Data
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    // 会员id，可能用不上
    @Id
    private String id;
    // 会员id，也可能用不上
    private String name;
    // 电话
    @Indexed  // 会分配下标给该字段
    @NonNull  // 非空检查
    private String telephone;
    // 验证码
    @Indexed  // 会分配下标给该字段
    @NonNull
    private String authCode;
    // @Searchable 按照富文本进行搜索
}
