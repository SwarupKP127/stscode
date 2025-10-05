package com.javatechie.interview.qa.service;

public class Car implements Vehicle {

	//java7
	//@Override
//	public void start() {
//		// TODO Auto-generated method stub
//		System.out.println("Car starting...");	
//	}

	//@Override
//	public void stop() {
//		// TODO Auto-generated method stub
//		System.out.println("Car stopped.");
//	}
	
	
	
	//java8
	 public void start() {
	        System.out.println("Car starting...");
	    }
	 
	 public static void main(String[] args) {
		 Car c = new Car();
		 c.start();
		 c.stop();        // Calls default method
		 Vehicle.service();  // Calls static method
	}

}
