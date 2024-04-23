/*
 * @Author: princewang666 1213246620@qq.com
 * @Date: 2024-04-23 10:48:24
 * @LastEditors: princewang666 1213246620@qq.com
 * @LastEditTime: 2024-04-23 10:48:52
 * @FilePath: \WGGT_MALL\mall_mbg_spring\src\main\java\com\wggt\mall_mbg_spring\Generator.java
 * @Description: 执行MyBatis Generator生成pojo，xml，mapper
 * 
 * Copyright (c) 2024 by wggt, All Rights Reserved. 
 */
package main.java.com.wggt.mall_mbg_spring;

public class Generator {
    public static void main( String[] args ) throws XMLParserException, IOException, InvalidConfigurationException, SQLException, InterruptedException
    {
        // mbg执行过程中的警告信息
        List<String> warnings = new ArrayList<>();  // 简写泛型，由编译器自动推断后面<>类型
        // 当生成同名xml覆盖
        boolean overwrite = true;
        // 读取配置文件
        File configFile = new File("mall_mbg/src/main/resource/generatorConfig.xml");
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
