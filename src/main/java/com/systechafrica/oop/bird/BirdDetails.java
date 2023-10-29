package com.systechafrica.oop.bird;

public class BirdDetails {
    private String name;
    private int age;

    public BirdDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void fly() {
        System.out.println(name + " is flying");
    }
}
