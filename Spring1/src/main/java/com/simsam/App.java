package com.simsam;

import com.simsam.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //Pakage needs to be imported

//        Horta ht = context.getBean("horta",Horta.class);
//        ht.compile();

        Doodle d = context.getBean(Doodle.class);
        //d.setAge(20);
        System.out.println(d.getAge());
        d.doodle();




        // USING XML BASED CONFIGURATION APPROACH


        //CREATED THE SPRING CONTAINER
        // THE CONFIGURATION IS PRESENT IN THE "spring.xml" FILE UNDER THE RESOURCE FOLDER
        // OBJECT IS CREATED HERE(there is a file spring.xml go there and create the objects for all the bean tags)



//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        // getBean() CALL THE OBJECT
        //"alien" IS THE ID DEFINING WHICH CLASS OBJECT IS TO BE CREATED
       // Alien obj = (Alien) context.getBean("alien1");

//        Doodle d1 = (Doodle) context.getBean("doodler");
//        Doodle d2 = (Doodle) context.getBean("doodler");
//        d1.age = 20;
//
//        obj.code();
////        obj2.doodle();
////        obj3.doodle();
//        System.out.println(d1.age);
//        System.out.println(d2.age);


        // NOTE :- When the scope is singleton it will create the object by default as soon as the application is loaded which
        // means singleton object will be created as soon as the container
        // is loading and can be used any number of times.

        //NOTE :- In prototype the object is created when we have getBean()

       // Doodle d = (Doodle) context.getBean("doodler"); // here getBean return the type object and then
        // we have to typecast the returned object to the class type
//        Doodle d = context.getBean("doodler", Doodle.class); // return the of the class type directly
//        d.setAge(20);
//        System.out.println(d.getAge());
//        d.doodle();
    }
}
