package com.javatechie.test;

public class Test2 {
    public static int test() {
        try {
            return 10;
        } finally {
            System.out.println("Finally executed");
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
