package com.javatechie.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> map = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread-1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread-2");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Map size: " + map.size());
    }
}

