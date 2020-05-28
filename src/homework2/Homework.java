package homework2;

import java.io.Serializable;
import java.util.Scanner;

import exception.DeadlineFormatException;

public abstract class Homework implements HomeworkInput, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2287825476866272023L;
	protected Homeworkkind kind=Homeworkkind.Physics;
	protected String subject;
	protected String deadline;
	protected String content;
	
	public Homework() {
	}	
	
	public Homework(Homeworkkind kind) {
		this.kind=kind;
	}
	public Homework(String subject, String deadline) {
		this.subject = subject;
		this.deadline = deadline;
	}
		
	public Homework(Homeworkkind kind, String subject, String deadline, String content) {
		this.kind=kind;
		this.subject = subject;
		this.deadline = deadline;
		this.content = content;
	}
	
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

	public void setDeadline(String deadline) throws DeadlineFormatException {
		this.deadline = deadline;
		if(!deadline.contains("¿œ") && !deadline.equals("")) {
			throw new DeadlineFormatException();
		}
		 this.deadline=deadline;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
    public abstract void printInfo();
    
	public void setHomeworkSubject(Scanner input) {
		
		System.out.println("Subject:");
    	String subject = input.next();
    	this.setSubject(subject);
		
	}
	
	public void setHomeworkDeadline(Scanner input) {
		String deadline="";
		while(!deadline.contains("¿œ")) {
		    System.out.println("Deadline :");
		    deadline=input.next();	
		    try {
		    	this.setDeadline(deadline);
		    } 
		    catch (DeadlineFormatException e) {
		    	System.out.println("Incorrect Deadline Format. put the deadline that cantains ¿œ");
			   
		    } 
		}
		
	}
	
	public void setHomeworkContent(Scanner input) {
		
		System.out.println("content :");
		String content=input.next();	
		this.setContent(content);
	}
    
	public String getKindString() {
		String hkind="none";
		switch (this.kind) {
		case Software:
			hkind="software";
			break;
		case Physics:
			hkind="physics";
			break;
		case Practical_work:
			hkind="practical_work";
			break;
		default:
		}	
		return hkind;
	}

	public void setHomeworkContentwithYN(Scanner input) {
		// TODO Auto-generated method stub
		
	}
}