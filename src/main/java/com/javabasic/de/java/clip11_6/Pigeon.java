package com.javabasic.de.java.clip11_6;

public class Pigeon extends Bird{

    @Override
    boolean flyable(int z) {
        return z < 10000;
    }
}
