package com.javatechie.test;

import java.util.*;

public class MapEnhancementsDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);

        // forEach
        map.forEach((k, v) -> System.out.println(k + " => " + v));

        // getOrDefault
        System.out.println(map.getOrDefault("C", 0)); // prints 0

        // putIfAbsent
        map.putIfAbsent("C", 30);

        // computeIfPresent
        map.computeIfPresent("A", (k, v) -> v + 5);

        // computeIfAbsent
        map.computeIfAbsent("D", k -> 40);

        // merge
        map.merge("B", 10, Integer::sum);

        System.out.println(map);
    }
}

