package com.javabasic.de.java.clip11_4;

public class Calculator {
    // 오버로딩
    int add(int x, int y, int z){
        return x + y + z;
    }
    long add(long a, long b, long c){
        return a + b + c;
    }
    int add(int x, int y){
        return x + y;
    }

}
