package com.javatechie.test;

public class Test1 {
    public static int test() {
        try {
            return 10;
        } finally {
            System.out.println("Finally executed");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
