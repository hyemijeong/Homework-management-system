package homework;

import java.util.ArrayList;
import java.util.Scanner;

import homework2.Homework;
import homework2.SoftwareHomework;

public class Homeworkmanager {
	ArrayList <Homework> homeworks= new ArrayList<Homework>();
	Scanner input;
	Homework homework;
	Homeworkmanager(Scanner input){		
		this.input=input;	
	}
	
	public void addHomework() { 
		int kind=0;
		while(kind!=1&&kind!=2) {
		    System.out.println("1.for Physics:");
		    System.out.println("2.for Software :");
		    System.out.println("Select homework kind between 1 and 2:");//입력할 과목의 종류를 구분하기위해 출력
		
		    kind = input.nextInt();
		    if(kind==1) {
		        homework=new Homework();
		        homework.getUserInput(input);
		        homeworks.add(homework);	
			    break;
	    	}
	    	else if(kind==2) {
	    		homework=new SoftwareHomework();
	    		homework.getUserInput(input);
	    		homeworks.add(homework);
	    		break;
	    	}
		    else {
		    	System.out.println("Select homework kind between 1 and 2:");		
		    }
		}//kind의 값이 1또는 2가 될 때까지 입력받아서 만약 1이면 Homework의 getUserInput함수를 실행시키고 2이면 SoftwareHomework의 getUserInput함수를 실행 시킨다.


		
	}
	
	public void deleteHomework() {
		
		System.out.println("Subject :");
		String homeworkSubject=input.next();
		int index=-1;
		System.out.print(homeworkSubject);
		for(int i=0; i<homeworks.size(); i++) {
			
			if (homeworks.get(i).getSubject().equals(homeworkSubject)) {
				index=i;
				break;
			}				
		}//입력받은 homeworkSubject와 Homework의 배열에 저장된 여러가지의 subject객체 중 같은 것을 찾는다면 subject가 있는 곳을 가리키는 i를 index값에 넣음 
		
		if (index>=0) {
			homeworks.remove(index);
			System.out.println("The subject is deleted");
		}//만약 같은 subject를 찾는다면 i>0이 될것이고 index또한 >0이 될것이다 이 때 remove를 이용하여 그곳에 저장된 객체를 삭제한다.   
		else {
			System.out.println("The subject has not been registered");
			return;
		}//index는 원래 -1이었으므로 같은 subject를 찾지 못한다면 계속 -1일 것이다. 이때는 같은subject를 찾지 못한것이므로 위와 같은 문구를 출력한다. 
		
			
	}//
	
	
	
	public void editHomework() {	
		System.out.println("Subject :");
		String homeworkSubject=input.next();
			for(int i=0; i<homeworks.size();i++) {
				Homework homework=homeworks.get(i);			
				if (homework.getSubject().contentEquals(homeworkSubject)){
					int num=-1; //num을 처음에 -1로 저장
					while (num!=4) {// num이라는 수가  4가 아닌 동안 안의 내용을 반복한다
			            System.out.println("**Homework Info Edit Menu**");
			            System.out.println("1. Edit subject");
			            System.out.println("2. Edit deadline");
			            System.out.println("3. Edit content");
		        	    System.out.println("4. Exit");
		        	    System.out.println("Select one number 1-4:");// 출력
			    
			            num = input.nextInt();//num에 입력한 수를 저장
			            if(num==1){ //만약 num이 1이면 subject를 입력받은 후 setSubject함수를 이용하여 그 값을 homework의 subject객체에 저장
			            	System.out.println("Subject:");
			            	String subject = input.next();
			            	homework.setSubject(subject);
			            }
			            else if(num==2){//만약 num이 2이면 deadline를 입력받은 후 setDeadline함수를 이용하여 그 값을 homework의 deadline객체에 저장
			        		System.out.println("Deadline :");
			        		String deadline=input.next();	
			        		homework.setDeadline(deadline);
			            }
			            else if(num==3){ //만약 num이 3이면 content를 입력받은 후 setContent함수를 이용하여 그 값을 homework의 content객체에 저장		        		
			        		System.out.println("Content :");
			        		String content=input.next();
			        		homework.setContent(content);
			            }
			            else {
			            	continue;// num 이 위와같은 수가 아니면 실행 안됨
			            }
					}
				}
			}
	  }
	
	public void viewHomework() {		
//		System.out.println("Subject :");
//		String homeworkSubject=input.next();
		System.out.println(" of registersed homeworks:"+homeworks.size());
        for(int i=0; i<homeworks.size(); i++) {
        	homeworks.get(i).printInfo();
        }
//지금까지 객체에 저장된 값을 모두 출력하는 함수 
	

	}
}
