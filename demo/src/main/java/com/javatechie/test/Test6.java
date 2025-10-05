package com.javatechie.test;

public class Test6 {
    public static int test() {
        int x = 10;
        try {
            return x;
        } finally {
            x = 20;
            System.out.println("Finally executed");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}

