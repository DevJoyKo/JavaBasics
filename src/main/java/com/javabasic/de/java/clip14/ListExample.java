package com.javabasic.de.java.clip14;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(10);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(
                list
        );

        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);

        int[] intArr = {1, 6, 8, 10};
        System.out.println(intArr[0]);

        for(int i=0; i < list.size(); i++){
            System.out.println(i);
        }

        for(int curr: list){// for each loop
            System.out.println(curr);
        }
    }

}
