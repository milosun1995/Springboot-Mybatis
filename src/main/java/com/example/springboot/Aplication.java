package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 17/5/21.
 */
	// Spring Boot 应用的标识
@SpringBootApplication
	// mapper 接口类扫描包配置
@MapperScan("com.example.springboot.dao")
public class Aplication {
	//程序入口
	//启动嵌入Tomcat 并初始化  spring 环境及其  spring 各个组件
	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}
}
