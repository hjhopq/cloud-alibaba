package com.hjh.cloud.service;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author hjh
 * @date 2020/5/21 12:41
 */

@org.apache.dubbo.config.annotation.Service
public class TestServiceImpl implements TestService {

    @Value("${server.port}")
    private String serverPort;

    @Override
    public String invoke(Integer id) {
        return "serverPort " + serverPort + "service。。。 " + id;
    }
}
