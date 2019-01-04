package com.example.entitylistenerwithnonmanagedfield;

import javax.persistence.*;

@EntityListeners(MyEntityListener.class)
@Entity
public class B {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @Transient
    private String optional;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }
}
