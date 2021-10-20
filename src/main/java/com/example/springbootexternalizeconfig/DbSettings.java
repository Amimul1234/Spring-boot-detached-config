package com.example.springbootexternalizeconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Amimul Ehsan
 * @Created at 10/19/21
 * @Project Spring boot externalize config
 */

@Configuration
@ConfigurationProperties("db")
public class DbSettings {

    private String host;
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost( String host ) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort( int port ) {
        this.port = port;
    }
}
