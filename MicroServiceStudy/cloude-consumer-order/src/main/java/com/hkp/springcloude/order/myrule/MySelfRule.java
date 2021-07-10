package com.hkp.springcloude.order.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: hkp
 * @create: 2021/06/26/17:35
 * @Description: what is it !
 * @Param:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return  new RandomRule();//随机的方法
    }
}
