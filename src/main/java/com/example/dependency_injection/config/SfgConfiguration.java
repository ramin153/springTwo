package com.example.dependency_injection.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@ConfigurationProperties("com.example.dependencyinjection")
@Configuration
public class SfgConfiguration {

    private String userName;
    private String password;
    private String JDBCurl;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJDBCurl() {
        return JDBCurl;
    }

    public void setJDBCurl(String JDBCurl) {
        this.JDBCurl = JDBCurl;
    }

}
