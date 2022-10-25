package com.javatechie.spring.mockito.api.entity;

public class Student {
	String name;
	int age;
	String firstName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", firstName=" + firstName + "]";
	}
	
	

}
