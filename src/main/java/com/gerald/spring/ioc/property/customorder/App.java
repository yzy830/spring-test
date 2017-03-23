package com.gerald.spring.ioc.property.customorder;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * <p>
 * 使用{@link org.springframework.core.env.MutablePropertySources#addLast(org.springframework.core.env.PropertySource)}
 * 等方法，可以指定一个属性源的查找顺序。
 * </p>
 * <p>
 * 例如在下面的方法中，是addFirst，可以让自定义的属性源先于JVM环境变量被查找，因此JVM_HOME被覆盖为了local1.properties文件中的值
 * </p>
 *
 */
@Configuration
@ComponentScan
@PropertySource("classpath:/application.properties")
public class App {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(App.class)) {
            context.getEnvironment()
                   .getPropertySources()
                   .addFirst(new LocalPropertySource("/com/gerald/spring/ioc/property/customorder/local1.properties"));
            
            String value = context.getEnvironment().getProperty("JAVA_HOME");
            System.out.println(value);
        }
    }
}
