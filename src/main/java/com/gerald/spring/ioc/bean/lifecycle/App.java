package com.gerald.spring.ioc.bean.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {        
    @Bean(initMethod = "init", destroyMethod="destroy")
    public TestBean bean() {
        return new TestBean();
    }
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        
        
        context.close();
    }
}
