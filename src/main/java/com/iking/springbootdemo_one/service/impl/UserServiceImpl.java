package com.iking.springbootdemo_one.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.iking.springbootdemo_one.mapper.UserMapper;
import com.iking.springbootdemo_one.model.User;
import com.iking.springbootdemo_one.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id查找对应的用户
     * @param id
     * @return
     */
    @Override
    public User selectUserById(String id) {
        User user = userMapper.selectById(id);
        return user;
    }


    /**
     * 根据年龄修改用户信息
     * @param user
     */
    @Override
    public void updateById(User user) {

        userMapper.updateById(user);
    }
}
