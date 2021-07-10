package com.hkp.springcloud.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: hkp
 * @create: 2021/06/27/16:30
 * @Description: what is it !
 * @Param:
 */
@Component
public class PaymentFallbackService implements  PaymentHystrixService{
    @Value("${server.port}")
    int  serverPort;
    @Override
    public String paymentInfo_OK(Integer id) {
        Lock   lock  =new ReentrantLock(true);
        return "我是消费端"+serverPort+":PaymentFallbackService提供方fall  paymentInfo_OK 服务器出现故障,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
         return "我是消费端"+serverPort+":PaymentFallbackService fall  paymentInfo_TimeOut 服务器出现故障,o(╥﹏╥)o";
    }
}
