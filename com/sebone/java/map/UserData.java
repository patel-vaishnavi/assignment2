package com.sebone.java.map;

public class UserData {
	private int rollNumber;
	private String name;
	private int age;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String toString() {
		return this.getRollNumber() + " " + this.getName() + " "
	            + this.getAge();
	}
}

