package com.bean;
import java.util.List;
import java.util.Iterator;

public class HelloUser {
	
	private int Id;
	private String Question;
	private List<Answer> Answers;

		public HelloUser(int id, String question, List<Answer> answers) {
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
		 Iterator<Answer> l=Answers.iterator();
		 while(l.hasNext())
		 {
			 System.out.println(l.next());
		 }
		 
	 }
}
