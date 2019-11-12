package com.lga.pattern.prototype;

import java.io.Serializable;

public class User implements Serializable {


    private String name;
    private Integer age;
    private Company company;

    public User(String name, Integer age, Company company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company=" + company +
                '}';
    }
}
