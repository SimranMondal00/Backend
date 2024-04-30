package com.simsam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Doodle {

    @Value("21")// not hard coded
    private int age;
   // private Alien jadoo ;

    //field injection
   //@Autowired
   //@Qualifier("horta")
    private Xenomorphs xezo;
    private int salary;

    public Doodle(){
     //   System.out.println("Doodle object created");
    }
     public Doodle(int age){
         System.out.println("Para Constructor called");
        this.age = age;
     }

//    public Doodle(int age, Alien jadoo) {
//        this.age = age;
//        this.jadoo = jadoo;
//    }
//
//    public Doodle(int age, Alien jadoo, int salary) {
//        this.age = age;
//        this.jadoo = jadoo;
//        this.salary = salary;
//    }
//
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
     //   System.out.println("setter called");
        this.age = age;
    }

//    public Alien getJadoo() {
//        return jadoo;
//    }
//
//    public void setJadoo(Alien jadoo) {
//        this.jadoo = jadoo;
//    }
//
//    public void doodle(){
//        System.out.println("Doodling");
//        jadoo.compile();
//    }


    public Xenomorphs getXezo() {
        return xezo;
    }
    @Autowired
    @Qualifier("horta") //setter injection
    public void setXezo(Xenomorphs xezo) {
        this.xezo = xezo;
    }
    public void doodle(){
        System.out.println("Doodling");
        xezo.compile();
    }

    }
