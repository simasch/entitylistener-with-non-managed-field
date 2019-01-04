package com.example.entitylistenerwithnonmanagedfield;

import javax.persistence.Transient;

public abstract class A {

    private String optional;

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }
}