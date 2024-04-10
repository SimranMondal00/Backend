package com.simsam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Autowired
    CPU speed;
    public void compile(){
        speed.testSpeed();
        System.out.println("Compiling");
    }
}
