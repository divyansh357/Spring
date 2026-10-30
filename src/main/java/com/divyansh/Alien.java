package com.divyansh;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Computer com;
    public Alien(){
        //System.out.println("Alien Object Created");
    }

    // Para constructor for constructor injection


//    @ConstructorProperties({"age","lap"})  // to specify using name in any order
//    public Alien(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }

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

    public void setCom(Computer com) {
        this.com = com;
    }

    // this lap ref is initialized by Spring through setter injection by ref attribute
    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
