package com.gerald.spring.aop.pointcuts.execution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 演示execution使用方法
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class App {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
            Test test = context.getBean(Test.class);
            
            test.show();
        }
    }
}
