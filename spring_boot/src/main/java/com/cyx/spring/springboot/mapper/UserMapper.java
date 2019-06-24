package com.cyx.spring.springboot.mapper;

import com.cyx.spring.springboot.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> getUserList();

    void insertUser(User user);
}