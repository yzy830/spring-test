package com.gerald.spring.aop.generic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 这个APP演示了泛型捕获问题，具体可以参考{@code Aop}的注释
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
