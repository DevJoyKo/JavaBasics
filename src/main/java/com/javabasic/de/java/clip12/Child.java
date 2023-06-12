package com.javabasic.de.java.clip12;

public class Child extends Person{

    static int speed = 5;
    public Child(String name, int age) {
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
        return true;
    }
}
