package com.enterpriseframework.infrastructure.domain.entities;

import com.enterpriseframework.core.domain.BaseEntity;

import java.util.UUID;

public class User extends BaseEntity {

    private UUID userId;
    private String userName;

    public User(UUID userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            return userId.equals(((User) obj).userId) &&
                    userName.equals(((User) obj).userName);
        }
        return false;
    }
}
