package homework2;

import java.util.Scanner;

public class SoftwareHomework extends HardHomework {
	
	private static final long serialVersionUID = 153139822609774207L;

	public SoftwareHomework(Homeworkkind kind) {
		super(kind);
	}
	
	@Override
	public void getUserInput(Scanner input) {
		setHomeworkSubject(input);
		setHomeworkDeadline(input);
		
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
		}
	}

	public void printInfo() {
		String hkind=getKindString();
		System.out.println("kind:"+hkind+" subject:" +subject+",deadline:"+deadline+",content:"+content);
	}

}
