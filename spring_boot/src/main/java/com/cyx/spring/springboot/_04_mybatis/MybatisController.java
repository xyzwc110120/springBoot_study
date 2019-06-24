package com.cyx.spring.springboot._04_mybatis;

import com.cyx.spring.springboot.domain.User;
import com.cyx.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/springboot")
public class MybatisController {

    private UserService userService;

    @Autowired
    public MybatisController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getUserList")
    @Transactional(readOnly = true)
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @RequestMapping("/saveUser")
    public void saveUser(User user) {
        userService.saveUser(user);
    }
}
