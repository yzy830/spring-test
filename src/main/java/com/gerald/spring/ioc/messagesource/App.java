package com.gerald.spring.ioc.messagesource;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class App {    
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        // 底层使用java.util.ResourceBundle，因此路径名称不需要使用classpath
        source.setBasenames("com/gerald/spring/ioc/messagesource/exception");
        
        return source;
    }
    
    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
            String noSuchMethod = context.getMessage("NoSuchMethodException", new Object[] {"main"}, Locale.UK);
            System.out.println(noSuchMethod);
        }
    }
}
