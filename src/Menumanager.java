package homework;

import java.util.Scanner; 

public class Menumanager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	//input�̶�� ������ �Է��� ��  ����.	
		
		Homeworkmanager homeworkmanager = new Homeworkmanager(input);
		
		int num=-1; //num�� ó���� -1�� ����
		while (num!=5) {// num�̶�� ����  5�� �ƴ� ���� ���� ������ �ݺ��Ѵ�
		    System.out.println("***Hyemi's Homework Management System***");
		    System.out.println("1. Add homework");
		    System.out.println("2. Delete homework");
		    System.out.println("3. Edit homework");
		    System.out.println("4. View homework");
		    System.out.println("5. Exit");
		    System.out.println("Select one number 1-6:");// ���
		    
		    num = input.nextInt();//num�� �Է��� ���� ����
		    if(num==1){ //���� num�� 1�̸� addHomework �Լ��� ����
		    	homeworkmanager.addHomework();
		    }
		    else if(num==2){ //���� num�� 2�̸� deleteHomework �Լ��� ����
		    	homeworkmanager.deleteHomework();	
		    }
		    else if(num==3){ //���� num�� 3�̸� editHomework �Լ��� ����
		    	homeworkmanager.editHomework();	
		    }
		    else if(num==4){ //���� num�� 4�̸� viewHomework �Լ��� ����
		    	homeworkmanager.viewHomework();	
		    }
		    else {
		    	continue;// num �� ���Ͱ��� ���� �ƴϸ� ���� �ȵ�
		    }
		}
     }
		

}
			
			
			
		


		    

