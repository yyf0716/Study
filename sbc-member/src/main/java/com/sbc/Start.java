package com.sbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @MapperScan(value="com.sbc.mapper")
@SpringBootApplication
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Start.class, args);
	}

}
