package com.javabasic.de.java.clip11_5_1;

import com.javabasic.de.java.clip11_5.AccessModifierTest;

public class Child extends AccessModifierTest {
    public void call(){
        this.messageOutside();
        this.messageProtected();
//        this.messageDefault();
//        this.messageInside();
    }
    public static void main(String[] args){
        Child child = new Child();
        child.call();
    }
}
