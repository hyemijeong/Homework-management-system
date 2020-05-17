package homework2;

import java.util.Scanner;

public class Practical_workHomework extends HardHomework {
	
	protected String anothercontent;
	
	public Practical_workHomework(Homeworkkind kind) {
		super(kind);
	}
	
	
	public void getUserInput(Scanner input) {
		setHomeworkSubject(input);
		setHomeworkDeadline(input);
		setHomeworkContentwithYN(input);	
		setanotherContentwithYN(input);
	}
	
	public void setanotherContentwithYN(Scanner input) {
		char answer='x';
		while (answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.println("Do you have a anothercontent? (Y/N)");
		    answer = input.next().charAt(0);
		    if (answer=='y'|| answer=='Y') {
		    	setHomeworkContent(input);
			}
			else if(answer=='n'|| answer=='N') {
			    this.setContent("");
			}
			else {	
			}
		}
		
	}
	public void printInfo() {
		String hkind=getKindString();
		System.out.println("kind:"+hkind+" subject:" +subject+",deadline:"+deadline+",content:"+content+"another content:"+anothercontent);
	}

}
