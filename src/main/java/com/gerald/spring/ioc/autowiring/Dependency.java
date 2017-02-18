package com.gerald.spring.ioc.autowiring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dependency {
    @Autowired
    private List<DependingType> dependingList;
    
    @Autowired
    private Map<String, DependingType> dependingMap;

    public List<DependingType> getDependingList() {
        return dependingList;
    }

    public Map<String, DependingType> getDependingMap() {
        return dependingMap;
    } 
}
