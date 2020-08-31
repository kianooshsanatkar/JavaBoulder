package com.enterpriseframework.infrastructure.domain.entities;

import java.util.UUID;

public class AuthInfo extends User {

    private String Password;

    public AuthInfo(UUID userId, String userName, String password) {
        super(userId, userName);
        Password = password;
    }


    //todo: Implement
    public boolean ValidatePassword(String password) {
        throw new UnsupportedOperationException();
    }

    //todo: Implement
    public void setPassword(String password) {
        throw new UnsupportedOperationException();
    }
}
