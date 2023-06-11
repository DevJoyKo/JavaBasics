package com.javabasic.de.java.clip11_7;

public interface Bird {
    void fly(int x, int y, int z);
    String STATIC_VARIABLE = "STATIC";
    default void printBreed(){
        // 공통적인 케이스가 있더라 -> 추가된 기능 -> interface에서 정의해줌
        System.out.println("나는 새 중에 "+getBreed()+" 입니다.");
    }

    String getBreed();

    static void staticMethod(){
        System.out.println("This is static method.");
    }
    void abstractMethod();
}

