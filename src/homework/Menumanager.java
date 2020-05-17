package homework;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class Menumanager {
	

	public static void main(String[] args) {
		System.out.println("Hi~");
		
		Scanner input = new Scanner(System.in);	//input�̶�� ������ �Է��� ��  ����.	
		
		Homeworkmanager homeworkmanager = new Homeworkmanager(input);
		selectMenu(input,homeworkmanager);
		
     }
	public static void selectMenu(Scanner input,Homeworkmanager homeworkmanager) {
		int num=-1; //num�� ó���� -1�� ����
		while (num!=5) {
			try{// num�̶�� ����  5�� �ƴ� ���� ���� ������ �ݺ��Ѵ�
			    showMenu();
		        num = input.nextInt();//num�� �Է��� ���� ����
		        switch(num) {
		        case 1:
		    	    homeworkmanager.addHomework();
		    	    break;
		        case 2:
		        	homeworkmanager.deleteHomework();	
		        	break;
		        case 3:
		        	homeworkmanager.editHomework();
		        	break;
		        case 4:
		        	homeworkmanager.viewHomework();	
		        	break;
		        default:
		        	continue;
		        }
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;				
			}
		}
	}
	public static void showMenu() {
		System.out.println("***Hyemi's Homework Management System***");
	    System.out.println("1. Add homework");
	    System.out.println("2. Delete homework");
	    System.out.println("3. Edit homework");
	    System.out.println("4. View homework");
	    System.out.println("5. Exit");
	    System.out.println("Select one number 1-6:");// ���
		
		
	}
		

}
			