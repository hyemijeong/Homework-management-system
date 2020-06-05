package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HomeworkViewer extends JPanel {

	WindowFrame frame;

	public HomeworkViewer(WindowFrame frame) {
		this.frame=frame;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject");
		model.addColumn("Deadline");
		model.addColumn("Content");
		model.addColumn("Contact Info.");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		

		// TODO Auto-generated constructor stub
	}

}
