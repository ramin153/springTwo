package com.example.dependency_injection.datasource;

public class FakeData {
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
