package com.enterpriseframework.infrastructure.domain.entities;

import com.enterpriseframework.core.domain.BaseEntity;
import com.enterpriseframework.core.domain.conventionalobjects.IAddress;
import com.enterpriseframework.core.domain.conventionalobjects.IEmail;

import java.util.Date;


public class Person extends BaseEntity {
    public User User;
    public String FirstName;
    public String LastName;
    public Date Birth;
    public IAddress Address;
    public Iterable<IEmail> Emails;
    public PersonState State;

    public Person(User user, String firstName, String lastName, Date birth, IAddress address,
                  Iterable<IEmail> emails, PersonState state) {
        this.User = user;
        FirstName = firstName;
        LastName = lastName;
        Birth = birth;
        Address = address;
        Emails = emails;
        State = state;
    }
}
