package com.hkp.springcloude.order.controller;

import com.hkp.springcloude.pojo.CommonResult;
import com.hkp.springcloude.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author: hkp
 * @create: 2021/06/26/14:44
 * @Description: what is it !
 * @Param:
 */

@RestController
@Slf4j
public class OrderController {
    //调用支付订单服务端的ip+端口号
    public static final String PAYMENT_URL = "http://mcroservice-payment";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    //获取id获取支付订单
    @GetMapping("/consumer/payment/get/{id}")
    @ResponseBody
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }


}