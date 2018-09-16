package com.bean;

public class HelloUser {
	
	private int Id;
	private String name;
	private float salary;

	


	public HelloUser(int id, String name, float salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}




	public void display()
	 {
		 System.out.println("Employee ID:"+ Id +" & Name is:"+name+"& Sal is:"+salary);
	 }
}
