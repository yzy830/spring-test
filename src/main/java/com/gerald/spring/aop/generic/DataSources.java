package com.gerald.spring.aop.generic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataSources {
    @Autowired
    private List<DataSource<?>> sources;
    
    @Autowired
    SourceOperation op;
    
    public void show() {
        for(DataSource<?> s : sources) {
            s.sync();
        }
    }
    
    public void process() {
        for(DataSource<?> s : sources) {
            op.processSource(s);
        }
    }
    
    
}
