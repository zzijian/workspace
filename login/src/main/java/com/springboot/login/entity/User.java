package com.springboot.login.entity;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String userName;
    private String password;
}
