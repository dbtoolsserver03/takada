package com.song.service;

import com.song.entity.User;

public interface UserService {

   
    void register(User user);


    User login(String username, String password);
}
