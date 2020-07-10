package com.mysiteforme.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.mysiteforme.admin.dao")
public class MysiteformeApplication extends SpringBootServletInitializer {

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(MysiteformeApplication.class);
//	}

    public static void main(String[] args) {
        SpringApplication.run(MysiteformeApplication.class, args);
    }
}
