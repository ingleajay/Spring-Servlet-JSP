package com.springtutorial.collection.standalone;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<Integer,String> department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<Integer, String> getDepartment() {
		return department;
	}
	public void setDepartment(Map<Integer, String> department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", department="
				+ department + "]";
	}
}
