package com.javabasic.de.java.clip12;

public class Main {
    public static void main(String[] args){
        Person child = new Child("손주", 20);
        Person parent = new Parent("부모", 50);
        Person grandParent = new GrandParent("조부모", 100);

        child.printLocation();
        parent.printLocation();
        grandParent.printLocation();

        child.walk();
        parent.walk();
        grandParent.walk();

        child.run();
        parent.run();
        grandParent.run();

        child.swim();
        parent.swim();
        grandParent.swim();

        child.printLocation();
        parent.printLocation();
        grandParent.printLocation();

    }
}
