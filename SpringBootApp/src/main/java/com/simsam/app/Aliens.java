package com.simsam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aliens {

    @Autowired
    Laptop laptop;
    public void code(){
        laptop.compile();
        System.out.println("coding");
    }
}
