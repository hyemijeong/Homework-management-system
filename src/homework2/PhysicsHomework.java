package homework2;

import java.util.Scanner;

public class PhysicsHomework extends Homework  {

	private static final long serialVersionUID = -445628104534483723L;

	public PhysicsHomework(Homeworkkind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setHomeworkSubject(input);
		setHomeworkDeadline(input);
		setHomeworkContent(input);
		
	}
	
	public void printInfo() {
		String hkind=getKindString();
		System.out.println("kind:"+hkind+" subject:" +subject+",deadline:"+deadline+",content:"+content);
	}

}
