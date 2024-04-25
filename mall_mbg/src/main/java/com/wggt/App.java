/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-15 11:19:03
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-04-25 17:27:39
 * @FilePath: \WGGT_MALL\mall_mbg\src\main\java\com\wggt\App.java
 * @Description: 执行MyBatis Generator生成xml
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package com.wggt;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class App 
{
    // 点击运行和配置launch.json是一样的
    public static void main( String[] args ) throws XMLParserException, IOException, InvalidConfigurationException, SQLException, InterruptedException
    {
        // mbg执行过程中的警告信息
        List<String> warnings = new ArrayList<>();  // 简写泛型，由编译器自动推断后面<>类型
        // 当生成同名xml覆盖
        boolean overwrite = true;
        // 读取配置文件
        File configFile = new File("mall_mbg/src/main/resources/generatorConfig.xml");
        // 创建配置相关信息
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        // 生成xml
        myBatisGenerator.generate(null);
        // 打印错误信息
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
