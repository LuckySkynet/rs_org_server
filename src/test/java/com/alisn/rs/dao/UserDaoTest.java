package com.alisn.rs.dao;

import com.alisn.rs.entity.User;
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
    public void testSomething(){

    }


    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setUserName("abc");
        user.setUserPasswd("777");
        userDao.insert(user);
    }

    @Test
    public void updatePasswd() throws Exception {
        User user = new User();
        user.setUserName("abc");
        user.setUserPasswd("88888");
        System.out.println(userDao.updatePasswd(user));
    }

    @Test
    public void find() throws Exception {
        User user = new User();
        user.setUserName("abc");
        user.setUserPasswd("777");
        System.out.println(userDao.find(user)) ;

        user.setUserPasswd("8888");
        System.out.println(userDao.find(user));

    }

}