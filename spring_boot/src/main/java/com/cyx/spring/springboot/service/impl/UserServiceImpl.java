package com.cyx.spring.springboot.service.impl;

import com.cyx.spring.springboot.domain.User;
import com.cyx.spring.springboot.mapper.UserMapper;
import com.cyx.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public void saveUser(User user) {
        userMapper.insertUser(user);
        // int i = 1 / 0;
    }
}
