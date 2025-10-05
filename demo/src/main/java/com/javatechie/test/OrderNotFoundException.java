package com.javatechie.test;



//public class OrderNotFoundException extends RuntimeException {//it behaves as unchecked exception
public class OrderNotFoundException extends Exception {

	public OrderNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
