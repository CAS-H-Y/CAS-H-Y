package com.heyang.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * creat on 2019/4/3
 * <p>
 * #author : CAS_hy
 **/
@FeignClient("hy")
public interface UserClient {

    @GetMapping("/test")
    void testuser();
}
