package com.gerald.spring.ioc.autowiring;

import org.springframework.stereotype.Service;

@Service
public class Depending2 implements DependingType {

    @Override
    public String getName() {
        return "depending2";
    }

}
