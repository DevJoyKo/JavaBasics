package com.javabasic.de.java.clip14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(0);
        integerSet.add(10);
        integerSet.add(8);
        integerSet.add(3);

        System.out.println(integerSet);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("LA");
        stringSet.add("NewYork");
        stringSet.add("Seoul");
        stringSet.add("Tokyo");
        stringSet.add("Sanfrancisco");
        System.out.println(stringSet);

        stringSet.remove("Seoul");
        System.out.println(stringSet);
        stringSet.remove("Sanghi");
        System.out.println(stringSet);

        System.out.println("exist LA? " + stringSet.contains("LA"));

        List<String> removeTarget = new ArrayList<>();
        removeTarget.add("LA");
        removeTarget.add("NewYork");
        stringSet.removeAll(removeTarget);
        System.out.println(stringSet);
        System.out.println("exist LA? " + stringSet.contains("LA"));

        System.out.println("Size: "+stringSet.size());
        stringSet.clear();
        System.out.println(stringSet);


    }
}
