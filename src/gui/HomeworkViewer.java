package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import homework.Homeworkmanager;
import homework2.HomeworkInput;

public class HomeworkViewer extends JPanel {

	WindowFrame frame;
	Homeworkmanager homeworkmanager;

	public HomeworkViewer(WindowFrame frame, Homeworkmanager homeworkmanager) {
		this.frame=frame;
		this.homeworkmanager = homeworkmanager;
		
		System.out.println("***"+ homeworkmanager.size() +"***");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject"); 
		model.addColumn("Deadline");
		model.addColumn("Content");
		model.addColumn("Contact Info.");
		
		for(int i=0; i< homeworkmanager.size(); i++) {
			Vector row = new Vector();
			HomeworkInput hi = homeworkmanager.get(i);
			row.add(hi.getSubject());
			row.add(hi.getDeadline());
			row.add(hi.getContent());
			model.addRow(row);
			
		}
	
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		

		// TODO Auto-generated constructor stub
	}

}
