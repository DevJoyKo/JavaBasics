package com.javabasic.de.java.clip11;

public class Main {
    static class Person{
//      멤버변수로 사용
        String name;
        String country;
        int age;
        Person(String name, String country, int age){
            this.name= name;
            this.country = country;
            if ("대한민국".equals(country)){
                this.age = age + 1;
            } else {
                this.age = age;
            }
        }
        Person(){

        }
    }
    public static void main(String[] args){
        Person minsoo = new Person("민수", "대한민국",20);
//        minsoo.name = "민수";
//        minsoo.country = "대한민국";
//        minsoo.age = 10;

        Person paul = new Person();
        paul.name =
                "Paul";
        paul.country = "USA";
        paul.age = 40;

        Person[] persons = {minsoo, paul};

        for (Person cur: persons){
            System.out.println("<자기소개>");
            System.out.println("안녕하세요? 저는 "+cur.name+"입니다.");
            System.out.println("저는 "+cur.country+"에서 태어났습니다.");
            System.out.println("저는 "+cur.age+"살 입니다.");
        }

    }
}
