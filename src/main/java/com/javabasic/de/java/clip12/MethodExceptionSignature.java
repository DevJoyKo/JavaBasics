package com.javabasic.de.java.clip12;

public class MethodExceptionSignature {
    static void methodThrowsException() throws Exception{

    }
    static void methodThrowsRuntimeException() throws RuntimeException {

    }

    public static void main(String[] args){
        methodThrowsRuntimeException(); // throws 있음
        try {
            methodThrowsException(); // throws 없음
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        methodThrowsException();
    }
}
