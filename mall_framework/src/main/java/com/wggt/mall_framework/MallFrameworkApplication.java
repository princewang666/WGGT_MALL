package com.wggt.mall_framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.wggt.mall_mbg_spring.mapper"})
public class MallFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallFrameworkApplication.class, args);
	}

}
