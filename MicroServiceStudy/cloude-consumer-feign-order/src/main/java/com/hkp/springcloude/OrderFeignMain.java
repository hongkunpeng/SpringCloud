package com.hkp.springcloude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: hkp
 * @create: 2021/06/27/9:48
 * @Description: Feign消费端主启动类
 * @Param:
 */
@SpringBootApplication
@EnableFeignClients//激活Feign的注解  需要加到主启动类上
public class OrderFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain.class, args);
    }
}
