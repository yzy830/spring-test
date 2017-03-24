package com.gerald.spring.aop.advice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>
 * Spring在发现类具有接口时，会使用JDK Proxy创建动态代理；由于在这个案例中，Target的部分接口来自TargetInt1，如果
 * 使用默认配置，Spring会创建一个TargetInt1类型的代理对象，那么<code>context.getBean(Target.class)</code>
 * 就是报找不到Bean的错误
 * </p>
 * 
 * <p>
 * 这个案例演示了各种advice以及在advice中如果捕获参数、返回值、异常、目标类型等问题
 * </p>
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class App {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
            Target t = context.getBean(Target.class);
            System.out.println("client out, " + t.process("shop", 12));
            System.out.println("*****************");
            System.out.println("client out, " + t.process());
            System.out.println("*****************");
            try {
                System.out.println("client out, " + t.doThrow());
            } catch(Exception e) {
                System.out.println("client out, " + e.getMessage());
            } 
            System.out.println("*****************");
            t.showName();
            System.out.println("*****************");
            
            Target2 t2 = context.getBean(Target2.class);
            System.out.println("client out, " + t2.getName());
        }
    }
}
