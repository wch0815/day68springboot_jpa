package com.cheng;

import com.cheng.dao.IUserDao;
import com.cheng.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Day68springbootJpaApplication.class)
class Day68springbootJpaApplicationTests {

    @Autowired
    private IUserDao userDao;

    @Test
    void contextLoads() {
        User s = new User(1,"zhangsan","123123",18,"xian");

        userDao.save(s);
    }

}
