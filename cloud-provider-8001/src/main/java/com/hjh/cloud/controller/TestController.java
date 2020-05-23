package com.hjh.cloud.controller;

import com.hjh.cloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjh
 * @date 2020/5/20 23:46
 */

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/test/{id}")
    public String test(@PathVariable("id") Integer id) {
        return "server-port：" + serverPort + " test 。。。 " + id;
    }

    @GetMapping("/invoke/{id}")
    public String invoke(@PathVariable("id") Integer id) {
        return testService.invoke(id);
    }

    @GetMapping("/config")
    public String config(@Value("${config.info}") String info) {
        return info;
    }
}
