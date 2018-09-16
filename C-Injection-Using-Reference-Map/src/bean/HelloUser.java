package bean;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

public class HelloUser {
	
	private int Id;
	private String Question;
	private Map<Answer,User> Answers;

	
	public HelloUser(int id, String question, Map<Answer, User> answers) {
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
		 
		 Set<Entry<Answer,User>> entry=Answers.entrySet();
		 
		 Iterator<Entry<Answer,User>> l=entry.iterator();
		 while(l.hasNext())
		 {
			 Entry<Answer,User> entry1=l.next();  
			 System.out.println("Answer Information:"+entry1.getKey());
			 
		        System.out.println(" Head Office is:"+entry1.getValue());  
		 }
		 
	 }
}
