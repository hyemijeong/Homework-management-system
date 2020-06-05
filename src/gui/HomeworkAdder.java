package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class HomeworkAdder extends JPanel {
	
	WindowFrame frame;
	
	public HomeworkAdder(WindowFrame frame) {
		this.frame=frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSubject = new JLabel("Subject: ",JLabel.TRAILING);
		JTextField fieldSubject = new JTextField (10);
		labelSubject.setLabelFor(fieldSubject);
		panel.add(labelSubject);  
		panel.add(fieldSubject);
		
		JLabel lableDeadline = new JLabel("Deadline: ",JLabel.TRAILING);
		JTextField fieldDeadline = new JTextField (10);
		labelSubject.setLabelFor(fieldDeadline);
		panel.add(lableDeadline);
		panel.add(fieldDeadline);
		
		JLabel lableContent = new JLabel("Content: ",JLabel.TRAILING);
		JTextField fieldContent = new JTextField (10);
		labelSubject.setLabelFor(fieldContent);
		panel.add(lableContent);
		panel.add(fieldContent);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		
		
	}

}
