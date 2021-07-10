package com.hkp.springcloude.service;

import com.hkp.springcloude.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: hkp
 * @create: 2021/06/27/9:52
 * @Description: what is it !
 * @Param:
 */
@ComponentScan
@FeignClient(value = "mcroservice-payment")//使用Feign
public interface FeignService {
    @GetMapping("/payment/get/{id}")
    CommonResult queryById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    int PaymentFeignTimeOut() throws InterruptedException;
}
