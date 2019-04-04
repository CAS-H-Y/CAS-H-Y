package com.heyang.dao;

import com.heyang.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;


/**
 * creat on 2019/4/2
 * <p>
 * #author : CAS_hy
 **/
@Mapper
public interface IUserDao {
    UserDO findUserInfo();
}
