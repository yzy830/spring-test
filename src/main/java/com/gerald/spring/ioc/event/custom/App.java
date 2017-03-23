package com.gerald.spring.ioc.event.custom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 这个案例演示了
 * (1) 可以不使用任意类型作为事件，不需要继承ApplicationEvent
 * (2) 事件处理方法的返回值会作为新的事件
 * (3) 通过{@code EventListener}标签，可以在一个监听器中处理多个事件
 * (4) 在监听方法上，使用{@code Async}标签，可以异步执行时间
 * (5) 可以通过{@code Order}来指定同一个时间的多个监听器的执行顺序
 *
 */
@Configuration
@ComponentScan
@EnableAsync
public class App {    
    @Bean
    public TaskExecutor taskExecutor() {
        SimpleAsyncTaskExecutor taskExecutor = new SimpleAsyncTaskExecutor();
        taskExecutor.setThreadNamePrefix("task-");
        taskExecutor.setConcurrencyLimit(5);
        return taskExecutor;
    }
    
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class)) {
            MyEventPublisher publisher = context.getBean(MyEventPublisher.class);
            publisher.publishEvent1();
        }
    }
}
