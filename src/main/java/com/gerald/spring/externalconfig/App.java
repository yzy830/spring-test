package com.gerald.spring.externalconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
            SimpleBean b = context.getBean(SimpleBean.class);
            System.out.println(b.getName());
        }
    }
}
