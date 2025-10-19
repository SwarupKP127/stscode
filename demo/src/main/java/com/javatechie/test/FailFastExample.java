package com.javatechie.test;

import java.util.*;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String s : list) {
            System.out.println(s);
            list.add("D"); // Structural modification during iteration
        }
    }
}





//Comparison Table
//Feature==>	Fail-Fast Iterator	| Fail-Safe Iterator
//Behavior on modification==>	Throws ConcurrentModificationException |	No exception
//Works on==>	Original collection |	Copy of the collection
//Package===>	java.util |	java.util.concurrent
//Reflects changes during iteration==>	Yes (but fails) |	No
//Performance====>	Faster |	Slightly slower (due to copy)