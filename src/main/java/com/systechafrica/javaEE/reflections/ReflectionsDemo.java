package com.systechafrica.javaEE.reflections;

import java.lang.reflect.Field;

public class ReflectionsDemo {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        Animal dog = new Animal("Bosco", 5);
        System.out.println(dog.getName());
        Field[] animalFields = dog.getClass().getDeclaredFields();

        for (Field field : animalFields) {
            System.out.println(field.getName());

            field.setAccessible(true);
            if(field.getName().equals("name")){
                field.set(dog, "Bosco Junior");
            }
        }

        System.out.println(dog.getName());
    }
}
