package com.heyang.service.Impl;

import com.heyang.dao.IUserDao;
import com.heyang.entity.UserDO;
import com.heyang.service.EhcacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * creat on 2019/4/2
 * <p>
 * #author : CAS_hy
 **/
@Service
public class EhcacheServiceImpl implements EhcacheService {

//    @Resource
//    IUserDao userdao;

    @Override
    @Cacheable(cacheNames = "DEMO_EHCACHE_NAME", key = "'DEMO_EHCACHE_KEY:'+#no", unless = "#no == 0")
    public String getEhcache(int no) {
        System.out.println("test:方法是否调用");
//        UserDO ud = userdao.findUserInfo();
//        System.out.println(ud.toString());
        return "test";
    }
}
