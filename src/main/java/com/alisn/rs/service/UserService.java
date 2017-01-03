package com.alisn.rs.service;

import com.alisn.rs.entity.User;

/**
 * Created by Skynet on 2017/1/1 12:17.
 */
public interface UserService {

    /**
     * 登陆
     */
    void login(String userName, String userPasswd);

    /**
     * 注册
     */
    void regist(User user);

    /**
     * 判断账号重复
     */
    void isRepeat();

    /**
     * 更改密码
     */
    void updatePassword();
}
