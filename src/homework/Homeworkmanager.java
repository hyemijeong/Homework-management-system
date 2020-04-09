package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Homeworkmanager {
	ArrayList <Homework> homeworks= new ArrayList<Homework>();
	Scanner input;
	Homeworkmanager(Scanner input){		
		this.input=input;	
	}
	
	public void addHomework() { 		
		Homework homework=new Homework();		
		System.out.println("Subject :");
		homework.subject=input.next();
		
		System.out.println("Deadline :");
		homework.deadline=input.next();
		
		System.out.println("Content :");
		homework.content=input.next();
		homeworks.add(homework);
	}// "Subject :"�� ��� �� Subject�� �Է¹ް� ���� "Deadline :"�� ��� ��  Deadline�� �Է¹ް� ����  
	//"Content :"�� ��� �� Content�� �Է¹ް� �����ϴ� �Լ�
	
	public void deleteHomework() {
		
		System.out.println("Subject :");
		String homeworkSubject=input.next();
		int index=-1;
		System.out.print(homeworkSubject);
		for(int i=0; i<homeworks.size(); i++) {
			
			if (homeworks.get(i).subject.equals(homeworkSubject)) {
				index=i;
				break;
			}				
		}
		
		if (index>=0) {
			homeworks.remove(index);
			System.out.println("The subject is deleted");
		}
		else {
			System.out.println("The subject has not been registered");
			return;
		}
		
			
	}//"Subject :"�� ��� �� Subject�� �Է¹ް� �����ϴ� �Լ�
	
	
	
	public void editHomework() {	
		System.out.println("Subject :");
		String homeworkSubject=input.next();
			for(int i=0; i<homeworks.size();i++) {
				Homework homework=homeworks.get(i);			
				if (homework.subject.contentEquals(homeworkSubject)){
					int num=-1; //num�� ó���� -1�� ����
					while (num!=4) {// num�̶�� ����  5�� �ƴ� ���� ���� ������ �ݺ��Ѵ�
			            System.out.println("**Homework Info Edit Menu**");
			            System.out.println("1. Edit subject");
			            System.out.println("2. Edit deadline");
			            System.out.println("3. Edit content");
		        	    System.out.println("4. Exit");
		        	    System.out.println("Select one number 1-4:");// ���
			    
			            num = input.nextInt();//num�� �Է��� ���� ����
			            if(num==1){ //���� num�� 1�̸� addHomework �Լ��� ����
			            	System.out.println("Subject:");
			            	homework.subject = input.next();
			            }
			            else if(num==2){ //���� num�� 2�̸� deleteHomework �Լ��� ����
			        		System.out.println("Deadline :");
			        		homework.deadline=input.next();			            		
			            }
			            else if(num==3){ //���� num�� 3�̸� editHomework �Լ��� ����			        		
			        		System.out.println("Content :");
			        		homework.content=input.next();
			            }
			            else {
			            	continue;// num �� ���Ͱ��� ���� �ƴϸ� ���� �ȵ�
			            }
					}
				}
			}
	  }//"Subject :"�� ��� �� Subject�� �Է¹ް� �����ϴ� �Լ�
	
	public void viewHomework() {		
//		System.out.println("Subject :");
//		String homeworkSubject=input.next();
        for(int i=0; i<homeworks.size(); i++) {
        	homeworks.get(i).printInfo();
        }
//"Subject :"�� ��� �� Subject�� �Է¹ް� �����ϴ� �Լ�
	

	}
}
