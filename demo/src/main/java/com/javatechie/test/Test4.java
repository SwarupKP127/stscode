package com.javatechie.test;

public class Test4 {
    public static int test() {
        try {
            int a = 10 / 0; // throws exception
            return 1;
        } catch (Exception e) {
            System.out.println("In catch");
            return 2;
        } finally {
            System.out.println("In finally");
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}