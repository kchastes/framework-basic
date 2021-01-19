package com.basic.boot;

import com.basic.boot.properties.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author KChaste Sun
 */
@SpringBootApplication
public class SpringBootBasicApplication {

    static MyBean bean;

    public SpringBootBasicApplication(MyBean myBean){
        SpringBootBasicApplication.bean = myBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicApplication.class, args);
        System.out.println(bean);
    }
}
