package com.gerald.spring.ioc.externalconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ExternalConfig.class)
public class Configure {
    @Autowired
    private ExternalConfig config;
    
    @Bean
    public DependingExternal dependingExternal() {
        DependingExternal depending = new DependingExternal();
        depending.setUrl(config.getUrl());
        
        return depending;
    }
}
