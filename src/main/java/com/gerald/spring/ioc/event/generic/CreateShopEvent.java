package com.gerald.spring.ioc.event.generic;

public class CreateShopEvent extends CreateEvent<Shop> {

    public CreateShopEvent(Shop source) {
        super(source);
    }

}
