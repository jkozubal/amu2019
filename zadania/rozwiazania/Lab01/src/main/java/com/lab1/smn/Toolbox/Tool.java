package com.lab1.smn.Toolbox;

import javax.annotation.PostConstruct;

public interface Tool {
    @PostConstruct
    static void Tool(){
        System.out.println("tool bean here");
    }
}
