package com.bean;
import java.util.List;
import java.util.Iterator;

public class HelloUser {
	
	private int Id;
	private String Question;
	private List<String> Answers;

		public HelloUser(int id, String question, List<String> answers) {
		super();
		Id = id;
		Question = question;
		Answers = answers;
	}

	public void display()
	 {
		 System.out.println("Employee ID:"+ Id );
		 System.out.println("Here the Question is:-"+Question+"???");
		 System.out.println("Answers Are:-");
		 Iterator<String> l=Answers.iterator();
		 while(l.hasNext())
		 {
			 System.out.println(l.next());
		 }
		 
	 }
}
