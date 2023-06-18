package com.javabasic.de.java.clip16;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("Korea", "Japan", "Chinca", "France"));
        Stream<String> stream = stringList.stream();
        stream.map((str) -> str.toUpperCase()).forEach(System.out::println);

//        stream.map(Main::logic).forEach(System.out::println);

        Stream<String> stream2 = stringList.stream();
//        stream2.map(Main::logic).forEach(System.out::println);

        List<String> stringList2 = new ArrayList<>(Arrays.asList("Korea", "Japan", "China"));
        Stream<String> errorStream = stringList2.stream();
            errorStream.map(Main::logic).map((str) ->
                    new ArrayList<>(Arrays.asList(str)).stream()
                            .map(String::toLowerCase).map((nextStr) -> {
                                System.out.println("inner lambda");
                                if ("korea".equals(nextStr)){
                                    throw new RuntimeException("error");
                                }
                                return nextStr;
                            }).findFirst())
                    .collect(Collectors.toList());


    }
    public static String logic(String param){
        System.out.println(param);
        System.out.println("logic");
        System.out.println(param.toUpperCase());
        return param.toUpperCase();
    }
}
