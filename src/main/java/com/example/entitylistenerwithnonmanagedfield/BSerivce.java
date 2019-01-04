package com.example.entitylistenerwithnonmanagedfield;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class BSerivce {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save() {
        B b = new B();
        b.setName("Peter");
        b.setOptional("Hans");

        em.persist(b);
    }
}
