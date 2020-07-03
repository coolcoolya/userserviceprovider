package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1,"小雨点14楼","1","李老师","15123903232","Y");
        UserAddress userAddress2 = new UserAddress(2,"小雨点26楼","2","汪老师","15123323223","N");
        return Arrays.asList(userAddress1,userAddress2);
    }
}
