package com.mysiteforme.admin;

import com.xiaoleilu.hutool.log.Log;
import com.xiaoleilu.hutool.log.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@MapperScan("com.mysiteforme.admin.dao")
public class MysiteformeApplication extends SpringBootServletInitializer {

    //	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(MysiteformeApplication.class);
//	}
    private static final Log log = LogFactory.get();

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(MysiteformeApplication.class, args);
        log.info("启动成功：" + "http://" + InetAddress.getLocalHost().getHostAddress() + ":8080/");
    }
}
