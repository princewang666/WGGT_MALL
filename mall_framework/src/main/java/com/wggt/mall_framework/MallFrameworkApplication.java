package com.wggt.mall_framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 指定扫描存放在其它项目的mapper
@MapperScan(basePackages = {"com.wggt.mapper"})
public class MallFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallFrameworkApplication.class, args);
	}

}
