package com.gerald.spring.ioc.property.customorder;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.env.PropertySource;

public class LocalPropertySource extends PropertySource<Properties> {
    private Properties properties;

    public LocalPropertySource(String name) {
        super(name);
        properties = new Properties();
        try {
            properties.load(LocalPropertySource.class.getResourceAsStream(name));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object getProperty(String name) {
        return properties.get(name);
    }

}
