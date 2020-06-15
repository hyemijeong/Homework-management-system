package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger; 

public class Menumanager {
	
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	//input이라는 변수에 입력한 값  저장.	
		
		Homeworkmanager homeworkmanager = getObject("homeworkmanager.ser");//new Homeworkmanager(input);
		if(homeworkmanager==null) {
			homeworkmanager = new Homeworkmanager(input);
		}
		else {
            homeworkmanager.setScanner(input);
        } 
		WindowFrame frame = new WindowFrame(homeworkmanager);	
		selectMenu(input,homeworkmanager);
		putObject(homeworkmanager,"homeworkmanager.ser");
		
     }
	public static void selectMenu(Scanner input,Homeworkmanager homeworkmanager) {
		int num=-1; 
		while (num!=5) {
			try{
			    showMenu();
		        num = input.nextInt();
		        switch(num) {
		        case 1:
		    	    homeworkmanager.addHomework();
		    	    logger.log("add a student");
		    	    break;
		        case 2:
		        	homeworkmanager.deleteHomework();
		        	logger.log("delete a student");
		        	break;
		        case 3:
		        	homeworkmanager.editHomework();
		        	logger.log("edit a student");
		        	break;
		        case 4:
		        	homeworkmanager.viewHomework();	
		        	logger.log("view a student");
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
	    System.out.println("Select one number 1-6:");// 출력
		
		
	}
	
	public static Homeworkmanager getObject(String filename) {
		Homeworkmanager homeworkmanager=null;
		try {
			FileInputStream file= new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			homeworkmanager=(Homeworkmanager)in.readObject();
			
			in.close();
			file.close();
			
		} catch(FileNotFoundException e) {
			return homeworkmanager;
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return homeworkmanager;
	}

	
	public static void putObject(Homeworkmanager homeworkmanager, String filename) {
		try {
			FileOutputStream file= new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
		    out.writeObject(homeworkmanager);
			
			out.close();
			file.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
			