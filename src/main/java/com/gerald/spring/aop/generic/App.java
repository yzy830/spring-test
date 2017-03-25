package com.gerald.spring.aop.generic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 演示advice的优先级问题。由于在同一个Aspect中，多个advice的优先级是不确定的，这里只演示在不同Aspect中advice的优先级问题
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class App {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
            DataSources dataSrcs = context.getBean(DataSources.class);
            
            dataSrcs.show();
            
            System.out.println("***********************************");
            
            dataSrcs.process();
            
            System.out.println("***********************************");
            
            SourceOperation operation = context.getBean(SourceOperation.class);
            
            operation.processAny("str");
            operation.processAny(12);
        }
    }
}
