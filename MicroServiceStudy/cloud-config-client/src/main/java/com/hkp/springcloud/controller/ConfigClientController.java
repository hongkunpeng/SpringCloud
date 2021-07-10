package com.hkp.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hkp
 * @create: 2021/07/10/22:26
 * @Description: what is it !
 * @Param:
 */
@RestController
public class ConfigClientController {
    @Value("${spring.cloud.config.uri}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }

}
