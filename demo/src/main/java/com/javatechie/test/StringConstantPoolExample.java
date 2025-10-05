package com.javatechie.test;

public class StringConstantPoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("javatechie");
		//1 heap memory
		//2 scp
		//two object created.
		
		String s2 = "javatechie";
		//no object created because javatechie reference is there
		
	    //Total object created is two
		
		
		System.out.println(s1.intern());
		System.out.println(s1.intern().hashCode()==s2.hashCode());

	}

}
