package com.introSpringFramwork.springFramework;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@ConditionalOnProperty(name = "deploy.env",havingValue = "development")
public class DevDB implements DB{

    public String getData(){
        return "Dev Data";
    }
}
