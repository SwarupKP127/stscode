package com.javatechie.test;

public class TryCatchFinallyRetunFlow {

//	public static int m1() {
//		try {
//			return 1;
//		}catch(Exception e) {
//			return 2;
//		}finally {
//			return 3;
//		}
//	}
	
//	public static int m1() {
//		try {
//			return 1;
//		}catch(Exception e) {
//			return 2;
//		}
//	}
	
	
//	public static int m1() {
//		try {
//			System.out.println(10/0);
//			return 1;
//		}catch(Exception e) {
//			return 2;
//		}
//	}
	
//	public static int m1() {
//		try {
//			System.out.println(10/0);
//			return 1;
//		}catch(Exception e) {
//			return 2;
//		}finally {
//			return 3;
//		}
//	}
	
	
//	public static int m1() {
//		try {
//			System.out.println(10/0);
//			return 1;
//		}catch(Exception e) {
//			return 2;
//		}finally {
//			System.exit(0);
//			return 3;
//		}
//	}
	
	public static int m1() {
		try {
			return 1;
		}catch(Exception e) {
			return 2;
		}finally {
			System.exit(0);
			return 3;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(m1());

	}

}
