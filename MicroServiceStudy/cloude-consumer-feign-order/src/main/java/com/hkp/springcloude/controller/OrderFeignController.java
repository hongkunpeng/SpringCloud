package com.hkp.springcloude.controller;

import com.hkp.springcloude.pojo.CommonResult;
import com.hkp.springcloude.pojo.Payment;
import com.hkp.springcloude.service.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: hkp
 * @create: 2021/06/27/9:56
 * @Description: what is it !
 * @Param:
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private FeignService feignService;
    @Value("${server.port}")
    int serverPort;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        CommonResult result = feignService.queryById(id);
        return result;
    }

    @GetMapping("/consumer/feign/timeout")
    public int PaymentFeignTimeOut() throws InterruptedException {
        return feignService.PaymentFeignTimeOut();
    }


}
