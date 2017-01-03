package com.alisn.rs.service.impl;

import com.alisn.rs.dao.UserMapper;
import com.alisn.rs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void login(String userName, String userPasswd) {

    }

    public void regist() {

    }

    public void isRepeat() {

    }

    public void updatePassword() {

    }
}
