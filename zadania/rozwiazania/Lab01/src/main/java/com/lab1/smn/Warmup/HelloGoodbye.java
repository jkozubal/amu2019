package com.lab1.smn.Warmup;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HelloGoodbye {
    @PostConstruct
    public static void HelloWorld(){
        System.out.println("Hello world");
    }
    @PreDestroy
    public static void GoodbyeWorld(){
        System.out.println("Goodbye");
    }
}
