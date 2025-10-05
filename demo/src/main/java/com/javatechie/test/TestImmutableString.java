package com.javatechie.test;

public class TestImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     String s = "java";
	     s.concat("techie");
	     System.out.println(s);//java
	     
	     //s will print java and s will not modify.
	     
	     
	     String password="pwd";
	     password.concat("123");
	     
	     
	     StringBuffer sb = new StringBuffer("Java");
	     sb.append(" Techie");
	     System.out.println(sb);
	     
	     StringBuilder sbuilder = new StringBuilder("Java");
	     sbuilder.append("Techie");
	     System.out.println(sbuilder);
	     
	     
	     

	}

}
