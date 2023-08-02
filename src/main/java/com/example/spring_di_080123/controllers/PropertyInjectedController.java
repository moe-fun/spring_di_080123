package com.example.spring_di_080123.controllers;

import com.example.spring_di_080123.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}
