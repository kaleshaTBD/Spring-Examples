package com.bean;

public class HelloUser {
	
	private int Id;
	private String name;


	 public HelloUser(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}


	public void display()
	 {
		 System.out.println("Employee ID:"+ Id +" & Name is:"+name);
	 }
}
