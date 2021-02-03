package com.feng.service;

import com.feng.entitiy.User;

import java.util.List;

public interface UserService {

    void login(User user);

    List<User> findAll();
}
