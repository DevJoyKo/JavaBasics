package com.javabasic.de.java.clip11_4;

public class Main {
    static class Animal {
        String name;
        Animal(String name){
            this.name = name;
        }
        public void cry(){
            System.out.println(name + " is crying.");
        }
    }
    static class Dog extends Animal {

        String breed;

        Dog(String name, String breed){
            super(name);
            this.breed = breed;
        }
        public void swim(){
            System.out.println(name + " is swimming");
        }
        public void bark(){
            System.out.println(name  + "("+breed+") is barking");
        }
    }
    static class Giraffe extends Animal {

        Giraffe(String name) {
            super(name);
        }

        @Override
        public void cry(){
            super.cry();
            System.out.println(name + " cannot cry.");
        }
    }
    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }
    }

    public static void main(String[] args){
        Dog dog = new Dog("코코", "푸들");
        dog.cry();
        dog.bark();

        Animal animal = dog;
        animal.cry();
//        animal.bark(); - 자식의 메서드 사용불가

        Animal giraffe = new Giraffe("기린");
        giraffe.cry();


    }

}
