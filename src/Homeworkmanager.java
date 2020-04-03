package homework;

import java.util.Scanner;

public class Homeworkmanager {
	Homework homework;
	Scanner input;
	Homeworkmanager(Scanner input){		
		this.input=input;	
	}
	
	public void addHomework() { 		
		homework=new Homework();		
		System.out.println("Subject :");
		homework.subject=input.next();
		
		System.out.println("Deadline :");
		homework.deadline=input.next();
		
		System.out.println("Content :");
		homework.content=input.next();
	}// "Subject :"를 출력 후 Subject에 입력받고 저장 "Deadline :"를 출력 후  Deadline에 입력받고 저장  
	//"Content :"를 출력 후 Content에 입력받고 저장하는 함수
	
	public void deleteHomework() {
		
		System.out.println("Subject :");
		String homeworkSubject=input.next();
		System.out.print(homeworkSubject);
		
		if (homework==null) {
			
			System.out.println("The subject has not been registered");
		return ;
		}
		if (homework.subject.equals(homeworkSubject)) {
			homeworkSubject=null;
			System.out.println("The subject is deleted");
		}			
			
	}//"Subject :"를 출력 후 Subject에 입력받고 저장하는 함수
	
	
	
	public void editHomework() {	
		System.out.println("Subject :");
		String homeworkSubject=input.next();
		
		if (homework.subject.equalsIgnoreCase(homeworkSubject)) {
			System.out.println("The subject to be edited is "+homeworkSubject);
		}
		
	}//"Subject :"를 출력 후 Subject에 입력받고 저장하는 함수
	
	public void viewHomework() {		
		System.out.println("Subject :");
		String homeworkSubject=input.next();
		
		if (homework.subject.equals(homeworkSubject)) {
		    homework.printInfo();
	}//"Subject :"를 출력 후 Subject에 입력받고 저장하는 함수
	

	}
}
