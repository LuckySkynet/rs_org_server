package com.alisn.rs.dao;

import com.alisn.rs.entity.User;

public interface UserDao {

    Integer insert(User user);

    Integer updatePasswd(User user);

    Integer find(User user);

    User getByName(String username);
}