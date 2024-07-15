package com.simsam;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Horta implements Xenomorphs{
    public Horta(){
        System.out.println("Horta object created");
    }
    @Override
    public void compile(){
        System.out.println("Horta is compiling the code");
    }
}
