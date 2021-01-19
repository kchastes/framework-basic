package com.basic.boot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * <p>在启动后运行一些特定的代码. 在
 * {@link org.springframework.boot.SpringApplication#run(String...) SpringApplication.run()}完成之前调用.
 *</p>
 * <p>适合在启动后,接受流量之前执行工作.</p>
 * @author KChaste Sun
 */
@Component
public class BootLifecycle implements CommandLineRunner, ApplicationRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner interface");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner interface");
    }
}
