package com.javabasic.de.java.clip12;

public class GrandParent extends Person{

    static int speed = 1;
    public GrandParent(String name, int age) {
        super(name, age, speed);
    }

    @Override
    boolean walkable() {
        return true;
    }

    @Override
    boolean runnable() {
        return false;
    }

    @Override
    boolean swimmable() {
        return false;
    }
}
