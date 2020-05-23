package com.hjh.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author hjh
 * @date 2020/5/21 0:24
 */

@RestController
@RequestMapping("/consume")
public class TestController {

    private static final String SERVICE_PATH = "http://cloud-provider-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test/{id}")
    public String test(@PathVariable("id") Integer id) {
        return  "consumer。。。 " + restTemplate.getForObject(SERVICE_PATH + "/test/" + id , String.class);
    }
}
