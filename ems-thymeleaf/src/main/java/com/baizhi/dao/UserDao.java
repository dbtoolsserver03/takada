package com.baizhi.dao;

import com.baizhi.entity.User;

public interface UserDao {

    //根据用户查询用户
    User findByUserName(String username);

    //保存用户信息
    void save(User user);

}
