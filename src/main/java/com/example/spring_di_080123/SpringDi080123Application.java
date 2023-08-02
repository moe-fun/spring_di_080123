package com.example.spring_di_080123;

import com.example.spring_di_080123.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDi080123Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringDi080123Application.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);
    }

}
