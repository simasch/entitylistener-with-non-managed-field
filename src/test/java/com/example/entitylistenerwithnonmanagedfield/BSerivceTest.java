package com.example.entitylistenerwithnonmanagedfield;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class BSerivceTest {

    @Autowired
    private BSerivce bSerivce;

    @Test
    public void save() {
        bSerivce.save();
    }
}