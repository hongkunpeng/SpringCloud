package com.hkp.springcloude.service;

import com.hkp.springcloude.dao.PaymentDao;
import com.hkp.springcloude.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: hkp
 * @create: 2021/06/26/14:08
 * @Description: what is it !
 * @Param:
 */
@Service
public class PaymenServiceImpl  implements  PaymentService{
    @Autowired
    PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
