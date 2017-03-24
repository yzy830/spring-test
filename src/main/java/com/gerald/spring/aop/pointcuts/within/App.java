package com.gerald.spring.aop.pointcuts.within;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 演示within使用方法。Within只能用于限定在某一个package中查找
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
