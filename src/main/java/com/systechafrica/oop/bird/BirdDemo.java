package com.systechafrica.oop.bird;

import java.util.ArrayList;
import java.util.List;

public class BirdDemo {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Pigeon());
        birds.add(new Eagle());

        for (Bird bird : birds) {
            bird.fly();
        }

        List<FlyingBird> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Eagle());

        for (FlyingBird flyingBird : flyingBirds) {
            flyingBird.soar();
        }

    }
}
