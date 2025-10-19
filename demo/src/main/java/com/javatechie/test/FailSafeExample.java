package com.javatechie.test;

import java.util.concurrent.*;

public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String s : list) {
            System.out.println(s);
            list.add("D"); // Allowed, no exception
        }
        
        
        System.out.println(list);
    }
}
