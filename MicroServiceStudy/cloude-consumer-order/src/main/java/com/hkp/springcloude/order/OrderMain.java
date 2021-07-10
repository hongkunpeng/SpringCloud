package com.hkp.springcloude.order;

import com.hkp.springcloude.order.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author: hkp
 * @create: 2021/06/26/14:40
 * @Description: what is it !
 * @Param:
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="mcroservice-payment",configuration = MySelfRule.class)
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }
}
