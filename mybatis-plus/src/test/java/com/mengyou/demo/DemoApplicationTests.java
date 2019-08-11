package com.mengyou.demo;

import com.mengyou.dao.UserDao;
import com.mengyou.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    public void userTest() {
        User user = userDao.selectById(5);
        System.out.println(user);
    }

}
