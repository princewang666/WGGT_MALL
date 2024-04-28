/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-11 10:33:47
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-04-28 17:45:25
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\MallFrameworkApplication.java
 * @Description: 
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;

@SpringBootApplication
// 指定扫描存放在其它项目的mapper
@MapperScan(basePackages = {"com.wggt.mapper"})
public class MallFrameworkApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallFrameworkApplication.class, args);
	}

	@Bean
	public OpenAPI wggtMallOpenAPI(@Value("${springdoc.version}") String appVersion) {
		Info info = new Info();
		return new OpenAPI().openapi("3.1.0").info(info);
	}
	/**
	 * 在注释界面上创建接口分组
	 * @param appVersion 从配置文件中获得的springdoc版本
	 * @return 返回自定义的接口文档头信息
	 */
	@Bean
	public GroupedOpenApi brandGroup(@Value("${springdoc.version}") String appVersion) {
		/**
		 * group: 指定分组名
		 * pathsToMatch:
		 */
		return GroupedOpenApi.builder().group("brand")
									   .pathsToMatch("/brand/**")
									   .addOperationCustomizer((operation, handlerMethod) -> {
											operation.addSecurityItem(new SecurityRequirement().addList("basicScheme"));
											return operation;
									   })
									   .addOpenApiCustomizer(openApi -> openApi.info(new Info().title("Brand API").version(appVersion)))
									   .build();
	}
}
