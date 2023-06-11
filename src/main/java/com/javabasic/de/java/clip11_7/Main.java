package com.javabasic.de.java.clip11_7;

public class Main {
    public static void main(String[] args){
        Bird bird = new Pigeon(); // 인터페이스 명세에 있는 함수만 사용 가능
        bird.fly(1,2,3);
        bird.printBreed();
        bird.abstractMethod();
        Bird.staticMethod();
        System.out.println(Bird.STATIC_VARIABLE); // 인터페이스에서 정적 변수 공통적으로 다룰 때
    }
}

