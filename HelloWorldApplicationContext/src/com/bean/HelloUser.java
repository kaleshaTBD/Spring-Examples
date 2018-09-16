package com.bean;

public class HelloUser {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 public void display()
	 {
		 System.out.println("Welcome to "+ name);
	 }
}
