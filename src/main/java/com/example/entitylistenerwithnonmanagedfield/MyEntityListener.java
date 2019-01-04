package com.example.entitylistenerwithnonmanagedfield;

import javax.persistence.PrePersist;

public class MyEntityListener {

    @PrePersist
    public void prePersist(B b){
        System.out.println(b.getOptional());
    }
}
