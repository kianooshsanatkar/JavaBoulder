package com.enterpriseframework.infrastructure.domain.entities;

import com.enterpriseframework.core.domain.conventionalobjects.IEmail;
import com.enterpriseframework.core.domain.conventionalobjects.IPhone;

import java.util.UUID;

public class RegistrationInfo extends User {

    public IEmail Email;
    public IPhone Phone;

    public RegistrationInfo(UUID userId, String userName) {
        super(userId, userName);
    }

    //todo: Implement
    public boolean IsQualified(){
        throw new UnsupportedOperationException("Not Implemented yet!");
    }
}
