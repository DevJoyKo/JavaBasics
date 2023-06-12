package com.javabasic.de.java.clip12;

public abstract class Person {
    String name;
    int age;
    int x,y;

    int speed;

    public Person(String name, int age, int speed){
        this.name = name;
        this.age = age;
        this.x = 0;
        this.y = 0;
        this.speed = speed;
    }
    public void walk(){
        if (this.walkable()) {
            this.x += 1;
            this.y += 1;
        } else {
            System.out.println(this.name + " not Walkable");
        }
    }
    public void run(){
        if (this.runnable()) {
            this.x += 2;
            this.y += 2;
        } else {
          System.out.println(this.name + " not Runnable");
        }
    }

    public void swim(){
        if (this.swimmable()) {
            this.x += 3;
            this.y -= 1;
        } else {
            System.out.println(this.name + " not Swimmable");
        }
    }

    public void printLocation(){
        System.out.println(this.name+" 현재 위치는 "+x+", "+y+", 스피드는 " +speed+" 입니다.");
    }
    abstract boolean walkable();
    abstract boolean runnable();
    abstract boolean swimmable();
}
