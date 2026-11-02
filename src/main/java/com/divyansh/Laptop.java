package com.divyansh;

import org.springframework.stereotype.Component;

@Component("com1")
public class Laptop implements Computer {

//    public Laptop(){
//        System.out.println("Laptop Object Created");
//    }

    @Override
    public void compile(){
        System.out.println("Compiling through Laptop...");
    }
}
