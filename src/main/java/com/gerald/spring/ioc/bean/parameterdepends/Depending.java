package com.gerald.spring.ioc.bean.parameterdepends;

public class Depending {
    private Singletone s;
    
    public Depending(Singletone s) {
        this.s = s;
    }

    public Singletone getS() {
        return s;
    }
}
