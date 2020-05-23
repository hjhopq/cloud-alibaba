package com.hjh.cloud.controller;

import com.hjh.cloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjh
 * @date 2020/5/21 20:08
 */

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/invoke/{id}")
    public String invoke(@PathVariable("id") Integer id) {
        return testService.invoke(id);
    }
}
