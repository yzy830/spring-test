package com.gerald.spring.ioc.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class Depending1 implements DependingType {

    @Override
    public String getName() {
        return "depending1";
    }

}
