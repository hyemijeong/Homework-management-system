package homework2;

import java.util.Scanner;

public abstract class HardHomework extends Homework {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8723543048619313502L;

	public HardHomework(Homeworkkind kind) {
		super(kind);
	}
	
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String hkind=getKindString();
		System.out.println("kind:"+hkind+" subject:" +subject+",deadline:"+deadline+",content:"+content);
		// TODO Auto-generated method stub

	}
	
	@Override
	public void setHomeworkContentwithYN(Scanner input) {
		char answer='x';
		while (answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
		    System.out.println("Do you have an content? (Y/N)");
		    answer = input.next().charAt(0);
		    if (answer=='y'|| answer=='Y') {
		    	setHomeworkContent(input);
			    break;
		    }
		    else if(answer=='n'|| answer=='N') {
			    this.setContent("");
		    }
		    else {
			
		    }
		} 
		
		answer='x';
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

}
