package homework2;

import java.util.Scanner;

import exception.DeadlineFormatException;

public interface HomeworkInput {
	
	public String getSubject();
	
	public void setSubject(String subject);
	
	public String getDeadline();
	
	public void setDeadline(String deadline) throws DeadlineFormatException;
	
	public String getContent();
	
	public void setContent(String content);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setHomeworkSubject(Scanner input);
	
	public void setHomeworkDeadline(Scanner input);
	
	public void setHomeworkContent(Scanner input);

}
