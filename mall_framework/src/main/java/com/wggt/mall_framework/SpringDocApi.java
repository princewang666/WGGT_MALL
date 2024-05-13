package com.wggt.mall_framework;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;

public class SpringDocApi {
    @Bean
	public OpenAPI wggtMallOpenAPI() {
        // 
		Info info = new Info().title("WGGT_MALL API文档").
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
