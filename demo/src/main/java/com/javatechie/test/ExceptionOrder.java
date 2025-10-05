package com.javatechie.test;

public class ExceptionOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//it causes exception due to hierarchy is not maintained
//		try {
//			System.out.println(10/0);
//		}catch(Exception x) {
//			System.out.println(x.getMessage());
//		}catch(ArithmeticException ex) {
//			System.out.println(ex.getMessage());
//		}finally {
//			System.out.println("finally");
//		}
		
		
		        //it does not cause exception due to hierarchy is maintained
				try {
					System.out.println(10/0);
				}catch(ArithmeticException ex) {
					System.out.println(ex.getMessage());
				}catch(Exception x) {
					System.out.println(x.getMessage());
				}finally {
					System.out.println("finally");
				}

	}

}
