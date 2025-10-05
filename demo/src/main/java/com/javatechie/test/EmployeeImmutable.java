package com.javatechie.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class EmployeeImmutable {
	
	private final String name;
	private final Date doj;
	private final List<String> mobile;
	
	
	private final Address address;


	public EmployeeImmutable(String name, Date doj, List<String> mobile, Address address) {
		this.name = name;
		this.doj = doj;
		this.mobile = mobile;
		this.address = address;
	}




	public String getName() {
		return name;
	}




	public Date getDoj() {
		return (Date) doj.clone();
	}




	public List<String> getMobile() {
		return new ArrayList<>(mobile);
	}




	public Address getAddress() {
		return new Address(address.getCity(), address.getZip());
		//return address;
	}


	@Override
	public String toString() {
		return "EmployeeImmutable [name=" + name + ", doj=" + doj + ", mobile=" + mobile + ", address=" + address + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address vAddress = new Address("bangalore", "560037");
		EmployeeImmutable vEmployeeImmutable = new EmployeeImmutable("Basant", new Date(), Arrays.stream(new String[] {"12345", "9863"}).collect(Collectors.toList()), vAddress);
		//vEmployeeImmutable.name="nayak";//it does not permit to modify
		vEmployeeImmutable.getDoj().setDate(15);
		vEmployeeImmutable.getMobile().add("9876");
		vEmployeeImmutable.getAddress().setCity("Pune");
		System.out.println(vEmployeeImmutable);
	}

}
