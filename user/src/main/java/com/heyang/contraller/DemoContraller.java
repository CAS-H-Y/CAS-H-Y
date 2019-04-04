package com.heyang.contraller;

import com.heyang.client.UserClient;
import com.heyang.service.EhcacheService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * creat on 2019/4/2
 * <p>
 * #author : CAS_hy
 **/
@RestController
@RequestMapping("/app")
@Api(tags = "demo测试")
public class DemoContraller {

    @Resource
    EhcacheService ehcacheService;

    @Resource
    UserClient userclient;

    @ApiOperation(value="测试请求info", notes="测试请求info", produces="application/json")
    @ApiResponse(code = 200, message = "新增用户结果")
    @GetMapping("/info/{i}")
    public Object getInfo(@PathVariable int i) {
        return ehcacheService.getEhcache(i);
    }

    @ApiOperation(value="测试请求test", notes="测试请求test", produces="application/json")
    @ApiResponse(code = 200, message = "新增用户结果")
    @GetMapping("/test")
    @HystrixCommand(fallbackMethod="helloFallbackMethod")/*调用方式失败后调用helloFallbackMethod*/
    public Object getTest() {
        userclient.testuser();
        return "test";
    }
}
