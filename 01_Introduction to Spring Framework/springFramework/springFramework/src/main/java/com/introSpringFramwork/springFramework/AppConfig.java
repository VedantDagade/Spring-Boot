package com.introSpringFramwork.springFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//Manual Bean-:
//Java based configuration

@Configuration
public class AppConfig {

    @Bean
    Food eatFood(){
        return new Food();
    }
}
