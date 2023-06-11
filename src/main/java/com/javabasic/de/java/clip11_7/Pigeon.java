package com.javabasic.de.java.clip11_7;

public class Pigeon implements Bird, Pet { // 상속은 단일상속만 되지만, implements는 여러개 가능, 다중 구현 가능
    private int x, y, z;

    @Override
    public void fly(int x, int y, int z) {
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }

    @Override
    public String getBreed() {
        return "비둘기";
    }

    @Override
    public void abstractMethod() {
        System.out.println("This is abstract method implemented from Pigeon");
    }

    public void printLocation() {
        System.out.println("현재 위치 (" + x + ", " + y + ", " + z + ")");
    }

    @Override
    public String getHome() {
        return "도곡동";
    }
}
