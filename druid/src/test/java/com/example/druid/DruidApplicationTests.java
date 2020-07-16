package com.example.druid;

import com.example.druid.dao.LoginMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DruidApplicationTests {
    @Autowired
    private LoginMapper loginMapper;

    @Test
    void contextLoads() {
        System.out.println(loginMapper.findall());
    }

}
