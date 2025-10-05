package com.javatechie.interview.qa.service;

public interface Vehicle {
    
	//java7
	//int MAX_SPEED = 120;  // public static final by default
    //void start();  // public abstract by default
    //void stop();
    
    
    //java8
    int MAX_SPEED = 120;

    void start(); // abstract method

    //Default method (has implementation)
    default void stop() {
        System.out.println("Vehicle stopped.");
    }

    //Static method (belongs to interface, not instances)
    static void service() {
        System.out.println("Vehicle servicing...");
    }
}
