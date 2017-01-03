package com.alisn.rs.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void insert() throws Exception {
//        String test = userDao.test();
//        System.out.println(test);
//        User user = new User();
//        user.setUserName("abc");
//        user.setUserPasswd("777");
//        System.out.println(userDao.insert(user));
    }

}