package com.example.demo.entity;

public class Employee {

	String name;
	int salary;

	int id;
	int address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	// Added ToSTring method in Master and Master is Master

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}

}
