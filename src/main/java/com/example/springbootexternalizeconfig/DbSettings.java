package com.example.springbootexternalizeconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @Author Amimul Ehsan
 * @Created at 10/19/21
 * @Project Spring boot externalize config
 */

@Configuration
@ConfigurationProperties("db")
public class DbSettings {

    private Map<String, String> connections;
    private String host;
    private int port;

    public Map<String, String> getConnections() {
        return connections;
    }

    public void setConnections( Map<String, String> connections ) {
        this.connections = connections;
    }

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
