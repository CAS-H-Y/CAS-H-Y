package com.heyang.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * creat on 2019/4/3
 * <p>
 * #author : CAS_hy
 **/
@FeignClient("heyang")
public interface UserClient {

    @GetMapping("/interface/test")
    void testuser();
}
