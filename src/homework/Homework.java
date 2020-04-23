package homework2;

import java.util.Scanner;

public class Homework {

	protected Homeworkkind kind=Homeworkkind.Physics;
	protected String subject;
	protected String deadline;
	protected String content;
	//다른 프로그램에서는 접근할 수 없도록 encapsulation을 함.
	
	public Homeworkkind getKind() {
		return kind;
	}

	public void setKind(Homeworkkind kind) {
		this.kind = kind;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

    // get함수를 이용하여 외부의 다른 클래스에서 변수를 이용할 수 있도록하고, set함수를 이용하여 다른 클래스에서 변수의 값을 바꿀 수 있게함.
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
	
	public void getUserInput(Scanner input) {
		System.out.println("Subject :");
		String subject=input.next();
		this.setSubject(subject);
		
		System.out.println("Deadline :");
		String deadline=input.next();
		this.setDeadline(deadline);
		
		System.out.println("Content :");
		String content=input.next();
		this.setContent(content);
		
	}//각각의 객체의 값을 입력받아 그 값을 저장하는 함수.
}
