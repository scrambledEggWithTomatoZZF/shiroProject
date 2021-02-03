package com.feng.service.impl;

import com.feng.entitiy.User;
import com.feng.mapper.UserMapper;
import com.feng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void login(User user) {
        if ("swxbcy".equals(user.getName())) {
            System.out.println("登录成功！");
        }
    }

    @Override
    public List<User> findAll() {
        List<User> userList = userMapper.findAll();
        return userList;
    }
}
