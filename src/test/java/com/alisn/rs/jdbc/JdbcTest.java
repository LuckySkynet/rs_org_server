package com.alisn.rs.jdbc;

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
@ContextConfiguration(locations = {"classpath:dao/spring-bean.xml"})
public class JdbcTest {

    @Autowired
    private ComboPooledDataSource dataSource;

    @Test
    public void testConn() throws SQLException {
        Connection connection = dataSource.getConnection();
        Assert.assertNotNull(connection);
        connection.close();
    }

}

