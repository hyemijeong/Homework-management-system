package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HomeworkViewer extends JFrame {

	public HomeworkViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject");
		model.addColumn("Deadline");
		model.addColumn("Content");
		model.addColumn("Contact Info.");
		
		JTable table = new JTable(new DefaultTableModel());
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);
		// TODO Auto-generated constructor stub
	}

}
