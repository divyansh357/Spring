package com.divyansh;

public class Alien {
    private int age;
    private Laptop lap;
    public Alien(){
        System.out.println("Alien Object Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

    public Laptop getLap() {

        return lap;
    }

    public void setLap(Laptop lap) {
        System.out.println("ref setter called");
        this.lap = lap;
    }

    // this lap ref is initialized by Spring through setter injection by ref attribute
    public void code(){
        System.out.println("Coding");
        lap.compile();
    }
}
