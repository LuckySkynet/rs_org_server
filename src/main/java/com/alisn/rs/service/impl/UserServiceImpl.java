package com.alisn.rs.service.impl;

import com.alisn.rs.dao.UserDao;
import com.alisn.rs.entity.User;
import com.alisn.rs.exception.UserException;
import com.alisn.rs.service.UserService;
import com.alisn.rs.util.EncoderUtil;
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


    public Integer login(User user) {
        return userDao.find(user);
    }

    public void regist(User user) {
        //加密操作
        String encodePasswd = EncoderUtil.md5EncodeWithSalt(user.getUserPasswd(), user.getUserName());
        user.setUserPasswd(encodePasswd);
        Integer flag = userDao.insert(user);
        if(flag < 1){
            throw new UserException("用户注册失败");
        }
    }

    public void isRepeat() {

    }

    public void updatePassword(User user, String newPasswd) {
        if (userDao.find(user) != 1) {
            throw new UserException("旧密码错误！");
        }
        user.setUserPasswd(newPasswd);
        if (userDao.updatePasswd(user) < 1) {
            throw new UserException("修改密码失败！");
        }
    }

    @Override
    public User getUser(String userName) {
        try {
            return userDao.getByName(userName);
        } catch (Exception e) {
            throw new UserException("获取用户失败！");
        }
    }
}
