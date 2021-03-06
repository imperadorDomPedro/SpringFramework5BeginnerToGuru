package com.gauro.demo.controllers;

import com.gauro.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Chandra
 */
@Controller
public class PropertyInjectedController {
    @Qualifier("greetingServiceImpl")
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
