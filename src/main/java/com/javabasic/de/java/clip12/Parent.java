package com.javabasic.de.java.clip12;

public class Parent extends Person{

    static int speed = 2;
    public Parent(String name, int age) {
        super(name, age, speed);
    }

    @Override
    boolean walkable() {
        return true;
    }

    @Override
    boolean runnable() {
        return true;
    }

    @Override
    boolean swimmable() {
        return false;
    }
}
