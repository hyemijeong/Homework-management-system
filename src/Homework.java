package homework;

public class Homework {
	String subject;
	String deadline;
	String content;
	
	public Homework() {
	}	
	
	public Homework(String subject, String deadline) {
		this.subject = subject;
		this.deadline = deadline;
	}
		
	public Homework(String subject, String deadline, String content) {
		this.subject = subject;
		this.deadline = deadline;
		this.content = content;
	}

	
	public void printInfo() {
		System.out.println("subject:" +subject+",deadline:"+deadline+",content:"+content);
	}
	
}