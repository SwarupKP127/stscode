package com.javatechie.test;

import java.util.HashSet;

public class Employee {
	
	private int id;
	private String name;

	public Employee() {
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

//	@Override
//	public int hashCode() {
//		return id;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		Employee employee = (Employee) obj;
//		return this.id==employee.getId() && this.name.equals(employee.getName());
//	}
	
	
	
	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Employee {id=" + id + ", name=" + name + "}";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello world");
		
		
		//case1
//		Employee employee1 = new Employee(101, "Basant");
//		Employee employee2 = new Employee(101, "Santosh");
		
		//comment hashCode() and equals() check output
		//uncomment hashCode() and equals() check output
//		System.out.println("is hashCode() same :: "+ (employee1.hashCode()==employee2.hashCode()));
//		System.out.println("is hashCode() same :: "+ (employee1.equals(employee2)));
		
//		HashSet<Employee> employees = new HashSet<Employee>();
//		employees.add(employee1);
//		employees.add(employee2);
//		System.out.println(employees);
		
		
		
		
		        //case2
//				Employee employee1 = new Employee(101, "Basant");
//				Employee employee2 = new Employee(101, "Basant");
				
				//comment hashCode() and equals() check output
				//uncomment hashCode() and equals() check output
//				System.out.println("is hashCode() same :: "+ (employee1.hashCode()==employee2.hashCode()));
//				System.out.println("is hashCode() same :: "+ (employee1.equals(employee2)));
		
//		HashSet<Employee> employees = new HashSet<Employee>();
//		employees.add(employee1);
//		employees.add(employee2);
//		System.out.println(employees);
		
		
		
		//case3
		Employee employee1 = new Employee(101, "Basant");
		Employee employee2 = new Employee(101, "Basant");
		
		//comment hashCode() and equals() check output
		//uncomment actual hashCode() and equals() check output
		System.out.println("is hashCode() same :: "+ (employee1.hashCode()==employee2.hashCode()));
		System.out.println("is hashCode() same :: "+ (employee1.equals(employee2)));

        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        System.out.println(employees);
		

	}

}
