package com.hkp.springcloude1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: hkp
 * @create: 2021/06/26/14:10
 * @Description: 支付接口模块的主启动类
 * @Param:
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain04 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain04.class,args);
    }
}
