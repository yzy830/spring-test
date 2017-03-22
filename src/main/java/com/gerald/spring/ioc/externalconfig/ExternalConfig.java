package com.gerald.spring.ioc.externalconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = ExternalConfig.PREFIX, ignoreUnknownFields = true)
public class ExternalConfig {
    public static final String PREFIX = "mysqldb.datasource";
    
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
