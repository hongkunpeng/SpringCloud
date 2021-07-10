package com.hkp.springcloude.dao;

import com.hkp.springcloude.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: hkp
 * @create: 2021/06/26/14:07
 * @Description: what is it !
 * @Param:
 */

@Mapper
@Repository
public interface PaymentDao {
    int create(Payment payment);
    Payment queryById(@Param("id")long id);
}
