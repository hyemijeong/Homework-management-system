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
	}// "Subject :"를 출력 후 Subject에 입력받고 저장 "Deadline :"를 출력 후  Deadline에 입력받고 저장  
	//"Content :"를 출력 후 Content에 입력받고 저장하는 함수
	
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
		
			
	}//"Subject :"를 출력 후 Subject에 입력받고 저장하는 함수
	
	
	
	public void editHomework() {	
		System.out.println("Subject :");
		String homeworkSubject=input.next();
			for(int i=0; i<homeworks.size();i++) {
				Homework homework=homeworks.get(i);			
				if (homework.subject.contentEquals(homeworkSubject)){
					int num=-1; //num을 처음에 -1로 저장
					while (num!=4) {// num이라는 수가  5이 아닌 동안 안의 내용을 반복한다
			            System.out.println("**Homework Info Edit Menu**");
			            System.out.println("1. Edit subject");
			            System.out.println("2. Edit deadline");
			            System.out.println("3. Edit content");
		        	    System.out.println("4. Exit");
		        	    System.out.println("Select one number 1-4:");// 출력
			    
			            num = input.nextInt();//num에 입력한 수를 저장
			            if(num==1){ //만약 num이 1이면 addHomework 함수를 실행
			            	System.out.println("Subject:");
			            	homework.subject = input.next();
			            }
			            else if(num==2){ //만약 num이 2이면 deleteHomework 함수를 실행
			        		System.out.println("Deadline :");
			        		homework.deadline=input.next();			            		
			            }
			            else if(num==3){ //만약 num이 3이면 editHomework 함수를 실행			        		
			        		System.out.println("Content :");
			        		homework.content=input.next();
			            }
			            else {
			            	continue;// num 이 위와같은 수가 아니면 실행 안됨
			            }
					}
				}
			}
	  }//"Subject :"를 출력 후 Subject에 입력받고 저장하는 함수
	
	public void viewHomework() {		
//		System.out.println("Subject :");
//		String homeworkSubject=input.next();
        for(int i=0; i<homeworks.size(); i++) {
        	homeworks.get(i).printInfo();
        }
//"Subject :"를 출력 후 Subject에 입력받고 저장하는 함수
	

	}
}
