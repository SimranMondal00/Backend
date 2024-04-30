package com.simsam.config;

import com.simsam.Alien;
import com.simsam.Doodle;
import com.simsam.Horta;
import com.simsam.Xenomorphs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.simsam")
public class AppConfig {

////    @Bean
////    public Doodle doodle(@Autowired Xenomorphs xezo){
////        Doodle obj = new Doodle();
////        obj.setAge(25);
////        obj.setXezo(xezo);
////        return obj;
////    }
//    //HERE THE BEAN HAS MORE THAN ONE OBJECT NAMELY FOR HORTA AND FOR ALIEN WHICH CREATES A CONFUSION FOR SPRING
//    // TO SOLVE THIS ISSUE WE HAVE TWO METHODS :- Qualifier AND Primary
//      @Bean
//    public Doodle doodle(Xenomorphs xezo){  //@Qualifier("horta")
//        Doodle obj = new Doodle();
//        obj.setAge(25);
//        obj.setXezo(xezo);
//        return obj;
//    }
//
//    //@Bean(name = "alien2")
//    //@Bean(name = {"sim","simsam"})
//
//    @Bean
//   // @Scope("prototype")
//    public Horta horta(){
//        return new Horta();
//    }
//
//    @Bean
//    // @Scope("prototype")
//    @Primary
//    public Alien alien(){
//        return new Alien();
//    }

}
