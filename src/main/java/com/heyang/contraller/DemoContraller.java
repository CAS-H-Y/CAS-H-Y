package com.heyang.contraller;

import com.heyang.service.EhcacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * creat on 2019/4/2
 * <p>
 * #author : CAS_hy
 **/
@RestController
@RequestMapping("/app")
public class DemoContraller {

    @Autowired
    EhcacheService ehcacheService;

    @GetMapping("/info/{i}")
    public Object getInfo(@PathVariable int i) {
        return ehcacheService.getEhcache(i);
    }
}
