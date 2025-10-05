package com.javatechie.test;

public class Test {
    
	public void getOrder(int orderId) throws OrderNotFoundException {
		if(orderId==101) {
			throw new OrderNotFoundException("Order not found with orderId :: "+orderId);
		}else {
			//do some logic
		}
	}
	
	
	public static void main(String[] args) throws OrderNotFoundException {
		Test vTest = new Test();
		vTest.getOrder(101);
	}

}
