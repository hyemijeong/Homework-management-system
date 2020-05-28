package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class HomeworkAdder extends JFrame {
	public HomeworkAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel lableSubject = new JLabel("Subject: ",JLabel.TRAILING);
		JTextField fieldSubject = new JTextField (10);
		lableSubject.setLabelFor(fieldSubject);
		panel.add(lableSubject);
		panel.add(fieldSubject);
		
		JLabel lableDeadline = new JLabel("Deadline: ",JLabel.TRAILING);
		JTextField fieldDeadline = new JTextField (10);
		lableSubject.setLabelFor(fieldDeadline);
		panel.add(lableDeadline);
		panel.add(fieldDeadline);
		
		JLabel lableContent = new JLabel("Content: ",JLabel.TRAILING);
		JTextField fieldContent = new JTextField (10);
		lableSubject.setLabelFor(fieldContent);
		panel.add(lableContent);
		panel.add(fieldContent);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 1, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
		
		
	}

}
