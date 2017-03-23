package com.gerald.spring.ioc.property.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/com/gerald/spring/ioc/property/propertysource/local2.properties")
public class Local2 {

}
