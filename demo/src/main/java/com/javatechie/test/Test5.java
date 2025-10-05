package com.javatechie.test;

public class Test5 {
    public static int test() {
        try {
            int a = 10 / 0;
            return 1;
        } finally {
            System.out.println("In finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
