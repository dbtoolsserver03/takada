package com.baizhi.service;

import com.baizhi.entity.User;

public interface UserService {

    //注册用户
    void register(User user);

    //用户登录
    User login(String username, String password);
}
