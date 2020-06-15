package homework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import homework2.Homework;
import homework2.HomeworkInput;
import homework2.Homeworkkind;
import homework2.PhysicsHomework;
import homework2.Practical_workHomework;
import homework2.SoftwareHomework;

public class Homeworkmanager implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3707635784900225385L;
	ArrayList <HomeworkInput> homeworks= new ArrayList<HomeworkInput>();
	transient Scanner input;
	
	Homeworkmanager(Scanner input){		
		this.input=input;	
	}
	
	public void addHomework() { 
		int kind=0;
		HomeworkInput homeworkInput;
		while(kind<1||kind>3) {
			try {
				
		        System.out.println("1.for Physics:");
		        System.out.println("2.for Software :");
		        System.out.println("3.for Practical_workHomework :");
	    	    System.out.println("Select homework kind between 1 and 2 or 3:");
		
		        kind = input.nextInt();
		        if(kind==1) {
		            homeworkInput=new PhysicsHomework(Homeworkkind.Physics);
		            homeworkInput.getUserInput(input);
		            homeworks.add(homeworkInput);	
			        break;
	        	}
	    	    else if(kind==2) {
	    	    	homeworkInput=new SoftwareHomework(Homeworkkind.Software);
	        		homeworkInput.getUserInput(input);
	        		homeworks.add(homeworkInput);
    	    		break;
	        	}
	    	    else if(kind==3) {
	        		homeworkInput=new Practical_workHomework(Homeworkkind.Practical_work);
	        		homeworkInput.getUserInput(input);
	    		    homeworks.add(homeworkInput);
	    	    	break;
	    	    }
		        else {
		        	System.out.println("Select homework kind between 1 and 2:");		
		        }
		    }
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}


		
	}
	
	public void deleteHomework() {
		
		System.out.println("Subject :");
		String homeworkSubject=input.next();
		int index=findIndex(homeworkSubject);
		removefromSubject(index , homeworkSubject);
	
	}
	
	public int findIndex(String homeworkSubject) {
		int index=-1;
        for(int i=0; i<homeworks.size(); i++) {
			if (homeworks.get(i).getSubject().equals(homeworkSubject)) {
				index=i;
				break;
			}				
		}
		return index;
	}
	
	public int removefromSubject(int index , String homeworkSubject) {
		if (index>=0) {
			homeworks.remove(index);
			System.out.println("The subject is deleted");
			return 1;
		}
		else {
			System.out.println("The subject has not been registered");
			return -1;
		}
	}
	
	
	public void editHomework() {	
		System.out.println("Subject :");
		String homeworkSubject=input.next();
			for(int i=0; i<homeworks.size();i++) {
				HomeworkInput homework=homeworks.get(i);			
				if (homework.getSubject().contentEquals(homeworkSubject)){
					int num=-1; //num을 처음에 -1로 저장
					while (num!=4) {// num이라는 수가  5이 아닌 동안 안의 내용을 반복한다
						showEditMenu();// 출력
			            num = input.nextInt();//num에 입력한 수를 저장
			            switch (num) {
			            case 1:
			            	homework.setHomeworkSubject(input);
			            	break;
			            case 2:
			            	homework.setHomeworkDeadline(input);
			            	break;
			            case 3:
			            	homework.setHomeworkContent(input);
			            	break;
			            default:
			            	continue;
			            }		            
					}
				}
			}
	  }//"Subject :"를 출력 후 Subject에 입력받고 저장하는 함수
	
	public void viewHomework() {		

		System.out.println(" of registersed homeworks:"+homeworks.size());
        for(int i=0; i<homeworks.size(); i++) {
        	homeworks.get(i).printInfo();
        }
        
	}
	public int size() {
		// TODO Auto-generated method stub
		return homeworks.size();
	}
	
	public HomeworkInput get(int index) {
		return (Homework) homeworks.get(index);
	}
	
	public void showEditMenu() {
    	System.out.println("**Homework Info Edit Menu**");
        System.out.println("1. Edit subject");
        System.out.println("2. Edit deadline");
        System.out.println("3. Edit content");
	    System.out.println("4. Exit");
	    System.out.println("Select one number 1-4:");// 출력
    }
	
	public void setScanner(Scanner input) {
        this.input = input;
    }

	

}
