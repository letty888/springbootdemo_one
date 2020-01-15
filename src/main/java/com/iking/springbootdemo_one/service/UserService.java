package com.iking.springbootdemo_one.service;

import com.iking.springbootdemo_one.model.User;

public interface UserService {

    public User selectUserById(String id);


   void updateById(User user);
}
