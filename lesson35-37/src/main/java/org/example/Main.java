package org.example;

import org.example.service.MainService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        MainService mainService = context.getBean(MainService.class);
        mainService.processRace();
    }
}