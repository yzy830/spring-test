package com.gerald.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gerald.spring.ioc.initorder.Base;
import com.gerald.spring.ioc.initorder.BaseDependent;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        context.getBeanFactory().registerSingleton(BaseDependent.class.getName(), new BaseDependent());
        
//        Base b = context.getBean(Base.class);
//        System.out.println(b.getName());
    }
}
