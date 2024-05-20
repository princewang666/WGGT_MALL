/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-05-20 09:46:05
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-05-20 10:16:12
 * @FilePath: \WGGT_MALL\mall_framework\src\main\java\com\wggt\mall_framework\config\OpenAPIConfig.java
 * @Description: OpenAPI文档配置信息
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt.mall_framework.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

// @Configuration需要配合@Bean使用，为Bean对象创建cglib代理
@Configuration
public class OpenAPIConfig {
    @Value("${springdoc.version}")
    private String docVersion;

    @Value("${springdoc.dev-url}")
    private String devUrl;

    // 加注解Bean返回OpenAPI对象，SpringDoc会自动解析
    @Bean
	public OpenAPI wggtMallOpenAPI() {
        // 开发服务器信息
        List<Server> servers = new ArrayList<>();
        Server devServer = new Server().url(devUrl)
                                       .description("开发环境本地服务器");
        servers.add(devServer);
		// 作者联系信息
		Contact contact = new Contact().name("Prince Wang")
									   .url("https://github.com/princewang666")
									   .email("121324662@qq.com");
		// 证书许可信息
		License license = new License().name("MIT License")
									   .url("https://mit-license.org/");
        // API文档界面信息
		Info info = new Info().title("WGGT_MALL API文档")
							  .description("WGGT_MALL的所有API接口规范文档")
							  .contact(contact)
							  .license(license)
							  .version(docVersion);
		return new OpenAPI().openapi("3.1.0")
							.info(info)
                            .servers(servers);
	}
}
