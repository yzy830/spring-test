package com.gerald.spring.aop.generic;

import org.springframework.stereotype.Component;

@Component
public class ShopDataSource implements DataSource<ShopModel> {
    @Override
    public void sync() {
        System.out.println("sync shop...");
    }
}
