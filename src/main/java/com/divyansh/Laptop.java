package com.divyansh;

public class Laptop implements Computer {

//    public Laptop(){
//        System.out.println("Laptop Object Created");
//    }

    @Override
    public void compile(){
        System.out.println("Compiling through Laptop...");
    }
}
