package com.lga.pattern.prototype;

import java.io.Serializable;

public class Company implements Serializable {

    private String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}

