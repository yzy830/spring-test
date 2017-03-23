package com.gerald.spring.ioc.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Def {
    @Bean
    @Profile("active-b1")
    public TestBean b1() {
        return ()->"b1";
    }
    
    @Bean
    @Profile({"active-b2", "default"})
    public TestBean b2() {
        return ()->"b2";
    }
}
