package com.springframework.spring6di.controllers;

import com.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    @Qualifier("setterGreetingBean")
    @Autowired
    private GreetingService greetingService;

//    @Autowired
//    @Qualifier("setterGreetingBean")
    public void setGreetingService(GreetingService greetingService) { // @Qualifier("setterGreetingBean") can use how arguments method!!
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
