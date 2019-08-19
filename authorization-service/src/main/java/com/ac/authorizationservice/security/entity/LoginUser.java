package com.ac.authorizationservice.security.entity;

import lombok.Data;


/**
 * @author hailong.sha
 */
@Data
public class LoginUser {

    private String username;
    private String password;
    private Boolean rememberMe;

}
