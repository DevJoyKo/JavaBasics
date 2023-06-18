package com.javabasic.de.java.clip17;

import java.util.Arrays;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {
        String[] arr = {"김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수"};
        List<String> names = Arrays.asList(arr);

//        int result = stringList.stream()
//                .reduce(0, (prev + next) -> );
//        System.out.println(result);
        long count = names.stream()
                .filter(str -> str.startsWith("이"))
                .count();
        System.out.println(count);
    }

    private static Integer checkfirst(Integer a, String s1) {
        if (s1.startsWith("이")){
            return a+1;
        }else{
            return a;
        }
    }
}
