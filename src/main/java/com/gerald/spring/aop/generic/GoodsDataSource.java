package com.gerald.spring.aop.generic;

import org.springframework.stereotype.Component;

@Component
public class GoodsDataSource implements DataSource<GoodsModel> {

    @Override
    public void sync() {
        System.out.println("sync goods...");
    }

}
