package com.javabasic.de.java.clip11_8;

public class Human {
    String name;
    int age;
    int x, y;
    int speed;

    public Human(String name, int age, int x, int y, int speed) {
        this.name = name;
        this.age = age;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public Human(String name, int age, int speed) {
        this(name, age, 0, 0, speed);

    }

    public String getLocation(){
        return "("+x+", "+y+")";
    }

    public void printWhoamI(){
        System.out.println("My name is "+this.name+". "+this.age + " years old.");
    }
}
