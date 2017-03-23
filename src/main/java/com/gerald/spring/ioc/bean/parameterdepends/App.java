package com.gerald.spring.ioc.bean.parameterdepends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        Depending d1 = context.getBean("d1", Depending.class);
        Depending d2 = context.getBean("d2", Depending.class);
        
        System.out.println(d1.getS().getName());
        System.out.println(d2.getS().getName());
    }
}
