package bean;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

public class HelloUser {
	
	private int Id;
	private String Question;
	private Map<String,String> Answers;

	

	public HelloUser(int id, String question, Map<String, String> answers) {
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
		 
		 Set<Entry<String,String>> entry=Answers.entrySet();
		 
		 Iterator<Entry<String,String>> l=entry.iterator();
		 while(l.hasNext())
		 {
			 Entry<String,String> entry1=l.next();  
		        System.out.println(entry1.getKey()+" Head Office is:"+entry1.getValue());  
		 }
		 
	 }
}
