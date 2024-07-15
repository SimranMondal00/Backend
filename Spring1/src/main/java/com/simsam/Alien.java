package com.simsam;

import org.springframework.stereotype.Component;

@Component
public class Alien implements Xenomorphs {
    public Alien(){
        System.out.println("Alien object created");
    }
    public void code(){
        System.out.println("Coding");
    }
    @Override
    public void compile(){
        System.out.println("Alien is compiling the code");
    }
}
