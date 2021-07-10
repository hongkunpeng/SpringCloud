package com.hkp.springcloude.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: hkp
 * @create: 2021/06/26/18:52
 * @Description: what is it !
 * @Param:
 */
@RestController
@Slf4j
public class OrderConsulController {
    public static final  String PAYMENT_URL = "http://cloud-provider-payment";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String getPayment(HttpServletRequest request) {
        System.out.println("调用服务提供方接口ok");
        return restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);

    }
}
