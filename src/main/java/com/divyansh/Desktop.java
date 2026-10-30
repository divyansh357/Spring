package com.divyansh;

public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.println("Compiling through Desktop...");
    }
}
