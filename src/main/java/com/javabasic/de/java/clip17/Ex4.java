package com.javabasic.de.java.clip17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> numArr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int result = numArr.stream()
                .reduce(0, Ex4::sum);
        System.out.println(result);

        String[] arr = {"데이터를", "배우는", "가장 쉬운", "방법은", "here", "at", "learning"};

        List<String> strArr = Arrays.asList(arr);
        String result2 = strArr.stream()
                .reduce("수업설명: ", (prev, next) -> prev + next + " ");
        System.out.println(result2);
    }

    public static int sum(int a, int b){
        System.out.println("a = "+a + ", b = "+ b);
        return a+b;
    }
}
