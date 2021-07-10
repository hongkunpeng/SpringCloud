package com.hkp.springcloude1.controller;

import com.hkp.springcloude.pojo.CommonResult;
import com.hkp.springcloude.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import com.hkp.springcloude1.service.PaymentService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: hkp
 * @create: 2021/06/26/14:09
 * @Description: what is it !
 * @Param:
 */
/*
 * 提供restful服务  供其他服务调用
 *
 * */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    int por;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment dept) {
        int res = paymentService.create(dept);
        log.info("***************插入成功*******" + res);
        if (res > 0) {
            return new CommonResult(200, "插入数据库成功", res);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")

    public CommonResult queryById(@PathVariable("id") Long id) {
        Payment payment = paymentService.queryById(id);
        log.info("***************查询成功*********" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功:" + por, payment);
        } else {
            return new CommonResult(444, "查询失败:" + por, null);
        }
    }
    //获取接口
    @GetMapping("/payment/lb")
    public int getPor()  {
        return por;
    }

}
