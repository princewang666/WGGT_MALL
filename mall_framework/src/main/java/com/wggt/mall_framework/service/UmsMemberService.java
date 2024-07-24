/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-07-19 17:11:35
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-07-24 15:27:11
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\service\UmsMemberService.java
 * @Description: RedisCRUD服务类
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.service;

import java.util.List;

import com.redis.om.spring.repository.RedisDocumentRepository;
import com.wggt.mall_framework.dao.Member;

// RedisDocumentRepository已经写好了简单的增删改查操作，直接调用即可，复杂按照规则写点名字
public interface UmsMemberService extends RedisDocumentRepository<Member, String> {

    /**
     * 根据电话查找符合的会员
     * @param telephone 传入的电话号码
     * @return 结果
     */
    public List<Member> findByTelephone(String telephone);
}
