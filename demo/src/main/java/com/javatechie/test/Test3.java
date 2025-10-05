package com.javatechie.test;

public class Test3 {
    public static int test() {
        try {
            int a = 10 / 0;  // throws ArithmeticException
            return 1;
        } catch (Exception e) {
            System.out.println("In catch");
            return 2;
        } finally {
            System.out.println("In finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}