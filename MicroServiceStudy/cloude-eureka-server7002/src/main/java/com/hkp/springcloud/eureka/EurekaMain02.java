package com.hkp.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: hkp
 * @create: 2021/06/26/16:19
 * @Description: what is it !
 * @Param:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain02.class,args);
    }
}
