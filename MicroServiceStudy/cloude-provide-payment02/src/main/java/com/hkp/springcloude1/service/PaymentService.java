package com.hkp.springcloude1.service;

import com.hkp.springcloude.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: hkp
 * @create: 2021/06/26/14:07
 * @Description: what is it !
 * @Param:
 */
public interface PaymentService {
    int create(Payment payment);

    Payment queryById(@Param("id")long id);

}
