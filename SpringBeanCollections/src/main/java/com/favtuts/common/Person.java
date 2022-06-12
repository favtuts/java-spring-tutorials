package com.favtuts.common;

public class Person {

	@Override
	public String toString() {
		return "Person{" +
			" name='" + getName() + "'" +
			", address='" + getAddress() + "'" +
			", age='" + getAge() + "'" +
			"}";
	}

	String name;
	String address;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}