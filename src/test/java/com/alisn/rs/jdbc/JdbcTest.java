package com.alisn.rs.jdbc;

import com.alisn.rs.dao.UserDao;
import com.alisn.rs.entity.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Skynet on 2016/12/31 14:59.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class JdbcTest {

    @Autowired
    private ComboPooledDataSource dataSource;

    @Autowired
    private UserDao userDao;

    @Test
    public void testConn() throws SQLException {
        Connection connection = dataSource.getConnection();
        Assert.assertNotNull(connection);
        connection.close();
    }

    @Test
    public void testQuery(){
       /* String userId = "c4d10dee-cf41-11e6-9d99-00163e304ed4";
        User user = userDao.selectByPrimaryKey(userId);
        Assert.assertNotNull(user);*/
    }

}

