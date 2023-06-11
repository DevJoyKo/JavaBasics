package com.javabasic.de.java.clip11_5_1;

import com.javabasic.de.java.clip11_5.AccessModifierTest;

public class Anonymous {
    public void call() {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
//        accessModifierTest.messageDefault();
//        accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
    }
}
