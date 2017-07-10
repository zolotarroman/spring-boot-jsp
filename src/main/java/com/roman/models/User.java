package com.roman.models;

import javax.annotation.ManagedBean;

@ManagedBean
public class User {

    public String name;
    public String surname;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
