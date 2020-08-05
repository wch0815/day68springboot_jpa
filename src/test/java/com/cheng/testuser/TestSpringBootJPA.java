package com.cheng.testuser;

import com.cheng.Day68springbootJpaApplication;
import com.cheng.dao.IUserDao;
import com.cheng.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Day68springbootJpaApplication.class)
public class TestSpringBootJPA {

    @Autowired
    private IUserDao userDao;

    @Test
    public void saveUser(){

        User s = new User(1,"zhangsan","123123",18,"xian");
        User user = userDao.save(s);
        System.out.println(user);
    }
}
