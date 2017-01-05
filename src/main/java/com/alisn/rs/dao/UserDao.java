package com.alisn.rs.dao;

import com.alisn.rs.entity.User;

public interface UserDao {

    void insert(User user);

    Integer updatePasswd(User user);

    Integer find(User user);
}