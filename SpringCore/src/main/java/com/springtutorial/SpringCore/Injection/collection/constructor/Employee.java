package com.springtutorial.SpringCore.Injection.collection.constructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<Integer,String> department;
	
	public Employee(String name, List<String> phones, Set<String> addresses, Map<Integer, String> department) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", department="
				+ department + "]";
	}
}
