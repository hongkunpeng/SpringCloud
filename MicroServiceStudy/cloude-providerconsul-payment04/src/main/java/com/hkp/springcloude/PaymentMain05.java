package com.hkp.springcloude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: hkp
 * @create: 2021/06/26/18:26
 * @Description: what is it !
 * @Param:
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain05 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain05.class,args);

    }
}
