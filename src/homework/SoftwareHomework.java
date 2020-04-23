package homework2;

import java.util.Scanner;

public class SoftwareHomework extends Homework {//Homework 클래스의 하위클래스로 SoftwareHomework 클래스 생성
	public void getUserInput(Scanner input) {
		System.out.println("Subject :");
		String subject=input.next();
		this.setSubject(subject);
		
		System.out.println("Deadline :");
		String deadline=input.next();
		this.setDeadline(deadline); //subject와 deadline의 값을 입력받아 각각의 객체에 저장 
		
		char answer='x';
		while (answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
		    System.out.println("Do you have an content? (Y/N)");
		    answer = input.next().charAt(0);
		    if (answer=='y'|| answer=='Y') {
			    System.out.println("Content :");
		        String content=input.next();
		        this.setContent(content);
		    }
		    else if(answer=='n'|| answer=='N') {
			    this.setContent("");
		    }
		    else {
			
		    }
		}//입력받은 answer의 값이 y이거나 Y이면 content를 입력받아서 저장하고 n이거나 N이면 content에 값을 입력하지 않는다. (*y,Y,n,N를 입력할 때 까지 반복함)
	}

}

