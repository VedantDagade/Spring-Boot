package com.introSpringFramwork.springFramework;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


//create Bean -: Manage by spring container
@Component
public class Apple {
    void eatApple(){
        System.out.println("I am eating apple");
    }

    void sellApple(){
        System.out.println("I am selling this apple");
    }


    //Bean lifeCycle
    @PostConstruct
    void callThisBeforeAppleUsed(){
        System.out.println("⭐⭐⭐⭐Creating the apple before use");
    }

    @PreDestroy
    void callThisAfterDestroy(){
        System.out.println("Destroying the Apple Bean (shown after stop the app)");
    }
}

