package com.mysiteforme.admin;

import com.xiaoleilu.hutool.log.Log;
import com.xiaoleilu.hutool.log.LogFactory;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

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
    private static String url;
    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext context = SpringApplication.run(MysiteformeApplication.class, args);
        Environment environment = context.getBean(Environment.class);
        url = "http://" + InetAddress.getLocalHost().getHostAddress() + ":" + environment.getProperty("server.port");
        log.info("启动成功，访问链接：" + url);
    }

    /*@Component
    public class RunHomePage implements CommandLineRunner {
        //启动成功后自动弹出页面
        public void run(String... args) {
            try {
                Runtime.getRuntime().exec("cmd   /c   start   http://localhost:8081/");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }*/
}
