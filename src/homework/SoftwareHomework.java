package homework2;

import java.util.Scanner;

public class SoftwareHomework extends Homework {//Homework Ŭ������ ����Ŭ������ SoftwareHomework Ŭ���� ����
	public void getUserInput(Scanner input) {
		System.out.println("Subject :");
		String subject=input.next();
		this.setSubject(subject);
		
		System.out.println("Deadline :");
		String deadline=input.next();
		this.setDeadline(deadline); //subject�� deadline�� ���� �Է¹޾� ������ ��ü�� ���� 
		
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
		}//�Է¹��� answer�� ���� y�̰ų� Y�̸� content�� �Է¹޾Ƽ� �����ϰ� n�̰ų� N�̸� content�� ���� �Է����� �ʴ´�. (*y,Y,n,N�� �Է��� �� ���� �ݺ���)
	}

}

