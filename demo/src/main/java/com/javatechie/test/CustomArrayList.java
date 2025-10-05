package com.javatechie.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class CustomArrayList extends ArrayList {


	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}else {
			return super.add(o);
		}
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomArrayList vCustomArrayList = new CustomArrayList();
		vCustomArrayList.add(1);
		vCustomArrayList.add(1);
		vCustomArrayList.add(1);
		vCustomArrayList.add(2);
		
		
		System.out.println(vCustomArrayList);
		
		
		Set<String> set = new HashSet<String>();
		set.add("2");
		set.add("2");
		set.add("3");
		System.out.println("set details :: "+set);
		
		
		Set<Student> students = new HashSet<Student>();
		Student student1 = new Student(101, "Basant");
		Student student2 = new Student(101, "Basant");
		Student student3 = new Student(102, "Nayak");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		//before implement hashCode method and equals method in Student class
		//System.out.println("Student details :: "+students);
		
		
		//before implement hashCode method and equals method in Student class
		System.out.println("Student details :: "+students);
		
		
	}

}
