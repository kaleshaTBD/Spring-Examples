package bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HelloUSer {
 
	private int id;
	private String name;
	private Map<Answer,User> answers;  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<Answer, User> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Answer, User> answers) {
		this.answers = answers;
	}
	public void display()
	{
		System.out.println("ID is"+id+"name IS"+name);
		  System.out.println("Here The Answers...");  
		    Set<Entry<Answer, User>> set=answers.entrySet();  
		    Iterator<Entry<Answer, User>> itr=set.iterator();  
		    while(itr.hasNext()){  
		        Entry<Answer, User> entry=itr.next();  
		        Answer ans=entry.getKey();  
		        User user=entry.getValue();  
		        System.out.println("Answer Information:");  
		        System.out.println(ans);  
		        System.out.println("Posted By:");  
		        System.out.println(user);  
		    }  
	}
	
}
