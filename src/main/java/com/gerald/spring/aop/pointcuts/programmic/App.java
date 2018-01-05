package com.gerald.spring.aop.pointcuts.programmic;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class App {
    public Pointcut pointcut() {
        return new AnnotationMatchingPointcut(Service.class);
    }

    public MethodInterceptor interceptor() {
        return new MethodInterceptor() {

            @Override
            public Object invoke(MethodInvocation invocation) throws Throwable {
                System.out.println("before");
                
                Object result = invocation.proceed();
                
                return result;
            }
        };
    }
    
    @Bean
    public Advisor advisor() {
        return new DefaultPointcutAdvisor(pointcut(), interceptor());
    }
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
        Target target = context.getBean(Target.class);
        target.foo();
    }
}
