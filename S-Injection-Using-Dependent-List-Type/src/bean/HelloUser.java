package bean;
import java.util.List;
import java.util.Iterator;

public class HelloUser {
	
	private int Id;
	private String Question;
	private List<Answer> Answers;

		

	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getQuestion() {
		return Question;
	}



	public void setQuestion(String question) {
		Question = question;
	}



	public List<Answer> getAnswers() {
		return Answers;
	}



	public void setAnswers(List<Answer> answers) {
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
