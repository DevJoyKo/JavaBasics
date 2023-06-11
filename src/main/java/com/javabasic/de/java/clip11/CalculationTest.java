package com.javabasic.de.java.clip11;

public class CalculationTest {
    static class Calculation{
//        protected, private, public
        static int add(int x, int y){
            // static method 정적 메서드 -> 인스턴스 생성 없이 사용 가능
            return x + y;
        }
        int subtract(int x, int y){
            // instance method 인스턴스 메서드
            return x - y;
        }
    }
    public static void main(String[] args){
        Calculation calculation = new Calculation();
        System.out.println("100 + 90 = " + calculation.add(100, 90));
        System.out.println("100 + 90 = " + Calculation.add(100, 90));
        System.out.println("100 - 90 = " + calculation.subtract(100, 90));

    }
}
