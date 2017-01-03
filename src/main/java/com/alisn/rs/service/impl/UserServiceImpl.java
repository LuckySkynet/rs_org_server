package com.alisn.rs.service.impl;

import com.alisn.rs.dao.UserDao;
import com.alisn.rs.entity.User;
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
    public UserServiceImpl(UserDao userDao)  {
        this.userDao = userDao;
    }


    public void login(String userName, String userPasswd) {

    }

    public void regist(User user) {
        userDao.insert(user);
    }

    public void isRepeat() {

    }

    public Integer updatePassword(User user,String newPasswd) {
        Integer i = userDao.find(user);
        if (i == 0 || i == null){
            return 0;
        }
        user.setUserPasswd(newPasswd);
        userDao.updatePasswd(user);
        return 1;
    }
}
