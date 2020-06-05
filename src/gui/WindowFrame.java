package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	public WindowFrame () {
		this.meneselection=new MenuSelection(this);
		this.homeworkadder = new HomeworkAdder(this);
		this.homeworkviewer= new HomeworkViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setupPanel(meneselection);
		this.setVisible(true);	
	
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	MenuSelection meneselection;
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
	HomeworkAdder homeworkadder;
	HomeworkViewer homeworkviewer;

	

}
