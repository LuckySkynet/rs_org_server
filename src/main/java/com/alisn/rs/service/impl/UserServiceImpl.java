package com.alisn.rs.service.impl;

import com.alisn.rs.dao.UserDao;
import com.alisn.rs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
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
