package com.hjh.cloud.controller;

import com.hjh.cloud.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjh
 * @date 2020/5/21 13:13
 */

@RestController
@RequestMapping("/consume")
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("/invoke/{id}")
    public String invoke(@PathVariable("id") Integer id) {
        return testService.invoke(id);
    }
}
