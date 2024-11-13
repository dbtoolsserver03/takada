package com.song.dao;

import com.song.entity.User;

public interface UserDao {


    User findByUserName(String username);

 
    void save(User user);

}
