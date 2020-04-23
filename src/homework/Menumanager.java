package homework;

import java.util.Scanner; 

public class Menumanager {
	

	public static void main(String[] args) {
		System.out.println("Hi~");
		
		Scanner input = new Scanner(System.in);	//input이라는 변수에 입력한 값  저장.	
		
		Homeworkmanager homeworkmanager = new Homeworkmanager(input);
		
		int num=-1; //num을 처음에 -1로 저장
		while (num!=5) {// num이라는 수가  5이 아닌 동안 안의 내용을 반복한다
		    System.out.println("***Hyemi's Homework Management System***");
		    System.out.println("1. Add homework");
		    System.out.println("2. Delete homework");
		    System.out.println("3. Edit homework");
		    System.out.println("4. View homework");
		    System.out.println("5. Exit");
		    System.out.println("Select one number 1-6:");// 출력
		    
		    num = input.nextInt();//num에 입력한 수를 저장
		    if(num==1){ //만약 num이 1이면 addHomework 함수를 실행
		    	homeworkmanager.addHomework();
		    }
		    else if(num==2){ //만약 num이 2이면 deleteHomework 함수를 실행
		    	homeworkmanager.deleteHomework();	
		    }
		    else if(num==3){ //만약 num이 3이면 editHomework 함수를 실행
		    	homeworkmanager.editHomework();	
		    }
		    else if(num==4){ //만약 num이 4이면 viewHomework 함수를 실행
		    	homeworkmanager.viewHomework();	
		    }
		    else {
		    	continue;// num 이 위와같은 수가 아니면 실행 안됨
		    }
		}
     }
		

}
