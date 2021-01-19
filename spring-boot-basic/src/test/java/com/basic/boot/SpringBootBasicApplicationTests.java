package com.basic.boot;

import com.basic.boot.properties.MyBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootBasicApplicationTests {
    @Autowired
    MyBean myBean;
    @Test
    void contextLoads() {

        System.out.println(myBean);
    }

}
