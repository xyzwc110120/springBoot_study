package com.cyx.spring.springboot.service;

import com.cyx.spring.springboot.domain.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    void saveUser(User user);
}
