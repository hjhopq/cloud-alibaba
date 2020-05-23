package com.hjh.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hjh
 * @date 2020/5/21 12:35
 */

@FeignClient(name = "cloud-provider-service")
public interface TestService {

    /**
     *  测试服务调用的接口  dubbo、openfeign
     *
     * @author hjh
     * @date 2020/5/21
     * @param id id
     * @return java.lang.String
     */
    @GetMapping("/invoke/{id}")
    String invoke(@PathVariable("id") Integer id);
}
