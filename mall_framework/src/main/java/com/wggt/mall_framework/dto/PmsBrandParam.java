/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-22 15:57:56
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-05-21 16:49:44
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\dto\PmsBrandParam.java
 * @Description: 商品品牌传输参数
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.dto;

import lombok.Data;

// 一个注解包含 toString，equals，hashcode，getter，setter，ArgsConstructor
@Data
public class PmsBrandParam {
    private String name;
    private String firstLetter;
    private Integer sort;
    private Integer factoryStatus;
    private Integer showStatus;
    private String logo;
    private String bigPic;
    private String brandStory;
}
