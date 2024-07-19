/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-07-19 17:11:35
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-07-19 17:33:27
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\service\UmsMemberService.java
 * @Description: 
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.service;

import com.redis.om.spring.repository.RedisDocumentRepository;
import com.wggt.mall_framework.dao.Member;

// RedisDocumentRepository已经写好了简单的增删改查操作，直接调用即可，复杂的可以在写点
public interface UmsMemberService extends RedisDocumentRepository<Member, String> {
    
}
