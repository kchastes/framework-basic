package com.basic.boot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author KChaste Sun
 */
@Component
public class MyBean {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
