package com.javatechie.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "example.txt";  // your file path
				
				try {
					BufferedReader br = new BufferedReader(new FileReader(filePath));// we are getting waring at a time compilation
					 while (br.readLine() != null) {
			                System.out.println(br.readLine());
			            }
				} catch (FileNotFoundException e) {//runtime exception
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {//compile time exception
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
