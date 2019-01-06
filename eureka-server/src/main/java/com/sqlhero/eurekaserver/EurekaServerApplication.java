package com.sqlhero.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：sqlhero.
 * @date ：Created in 15:26 2018/12/1
 * @description ：EurekaServer启动
 * @modified By：
 * @version: 0.0.1
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
