package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import homework.Homeworkmanager;

public class WindowFrame extends JFrame {
	
	Homeworkmanager homeworkmanager;
	MenuSelection meneselection; 
	HomeworkAdder homeworkadder;
	HomeworkViewer homeworkviewer;
	
	public WindowFrame (Homeworkmanager homeworkmanager) {
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My frame");
		
		this.homeworkmanager= homeworkmanager;
		meneselection = new MenuSelection(this);
		homeworkadder = new HomeworkAdder(this);
		homeworkviewer = new HomeworkViewer(this, this.homeworkmanager);
		
		
		
		
		this.setupPanel(meneselection);
		this.setVisible(true);	
	
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMeneselection() {
		return meneselection;
	}
	public void setMeneselection(MenuSelection meneselection) {
		this.meneselection = meneselection;
	}
	public HomeworkAdder getHomeworkadder() {
		return homeworkadder;
	}
	public void setHomeworkadder(HomeworkAdder homeworkadder) {
		this.homeworkadder = homeworkadder;
	}
	public HomeworkViewer getHomeworkviewer() {
		return homeworkviewer;
	}
	public void setHomeworkviewer(HomeworkViewer homeworkviewer) {
		this.homeworkviewer = homeworkviewer;
	}


	

}
