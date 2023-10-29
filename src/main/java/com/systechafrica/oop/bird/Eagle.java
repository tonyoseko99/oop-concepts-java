package com.systechafrica.oop.bird;

public class Eagle implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void soar() {
        System.out.println("Eagle is soaring");  // achieves Liskov Substitution Principle
                                                 // because Eagle is a FlyingBird
                                                 // and FlyingBird is a Bird
    }
}
