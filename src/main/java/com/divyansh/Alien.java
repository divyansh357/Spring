package com.divyansh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    private int age;

    // Field Injection
//    @Autowired
//    @Qualifier("desktop")
    private Computer com;
    public Alien(){
        //System.out.println("Alien Object Created");
    }

    // Para constructor for constructor injection


    // Constructor Injection
//    @ConstructorProperties({"age","lap"})  // to specify using name in any order
//    public Alien(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }

    // Value Annotation
    @Value("21")
    public void setAge(int age) {
        //System.out.println("Setter Called");
        this.age = age;
    }

//    public Laptop getLap() {
//
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        System.out.println("ref setter called");
//        this.lap = lap;
//    }

    public Computer getCom() {
        return com;
    }

    // Setter Injection
    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    // this lap ref is initialized by Spring through setter injection by ref attribute
    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
