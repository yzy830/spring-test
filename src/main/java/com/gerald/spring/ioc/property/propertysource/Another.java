package com.gerald.spring.ioc.property.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:/com/gerald/spring/ioc/property/propertysource/local3.properties",
                 "classpath:/com/gerald/spring/ioc/property/propertysource/local4.properties",
                 "classpath:/com/gerald/spring/ioc/property/propertysource/local5.properties"})
public class Another {

}
