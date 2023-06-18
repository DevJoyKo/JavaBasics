package com.javabasic.de.java.clip17;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("속초");
        list.add("서울");

        System.out.println(list);

        List<String> result = list.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println(list);

        Set<String> result2 = list.stream()
                .filter("서울"::equals)
                .collect(Collectors.toSet());

        System.out.println(result2);
    }
}

