package com.lab1.smn.Toolbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Toolbox {

    @Autowired
    private List<Tool> tools;


    @Bean
    public Tool toolBean(){
        Tool shovel = new Tool(){};
        return shovel;
    }


    @PostConstruct
    public static void created(){
        System.out.println("Toolbox created");
    }
}
