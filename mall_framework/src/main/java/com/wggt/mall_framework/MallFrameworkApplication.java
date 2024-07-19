/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-11 10:33:47
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-05-21 10:57:51
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\MallFrameworkApplication.java
 * @Description: 项目启动文件
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;

@SpringBootApplication
// 指定扫描存放在其它项目的mapper
@MapperScan(basePackages = {"com.wggt.mapper"})
// 扫描当前包下有@Document的注解
@EnableRedisDocumentRepositories(basePackages = "com.wggt.mall_framework.*")
public class MallFrameworkApplication {
	// 项目Swagger-ui接口文档:http://localhost:8080/swagger-ui/index.html
	public static void main(String[] args) {
		SpringApplication.run(MallFrameworkApplication.class, args);
	}
}
