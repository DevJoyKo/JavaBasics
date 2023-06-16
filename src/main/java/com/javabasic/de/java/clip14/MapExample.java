package com.javabasic.de.java.clip14;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "berry");
        map.put(3, "cherry");
        map.put(100, "pineapple");
        System.out.println(map);

        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("first", "apple");
        stringMap.put("second", "berry");
        stringMap.putIfAbsent("second", "pineapple");
        stringMap.putIfAbsent("third", "pineapple");
        System.out.println(stringMap);

        if (stringMap.containsKey("first")) {
            System.out.println("exist: "+stringMap.get("first"));
        }
        if (!stringMap.containsKey("notexsit")){
            System.out.println("doesn't exist");
        }

        for (String key: stringMap.keySet()){
            System.out.println(stringMap.get(key));
        }

        System.out.println(stringMap.values());

        stringMap.remove("first");
        System.out.println(stringMap);

        stringMap.clear();
        System.out.println("size: "+stringMap.size());

    }
}
