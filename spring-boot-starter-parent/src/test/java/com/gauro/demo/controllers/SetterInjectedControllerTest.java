package com.gauro.demo.controllers;

import com.gauro.demo.services.GreetingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Chandra
 */
@Slf4j
class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @Test
    void setGreetingService() {
        controller=new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        log.info(controller.getGreeting());

    }

}