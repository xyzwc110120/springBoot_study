package com.cyx.spring_java_config._06_profile;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyDataSource {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "MyDataSource{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
