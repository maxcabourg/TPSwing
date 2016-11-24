import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainWindow extends JFrame implements ActionListener{
	
	private JTextField nameField = new JTextField();
	private JTextField lastNameField = new JTextField();
	private JTextField phoneField = new JTextField();
	private JTextArea descriptionArea = new JTextArea(5, 40);
	public MainWindow(){
		super("Une super fenetre");
		//PANELS
		JPanel panelGeneral = new JPanel();
		JPanel panelNorth = new JPanel();
		JPanel panelCenter = new JPanel();
		JPanel panelSouth = new JPanel();
		
		//WIDGETS
		panelNorth.setLayout(new GridLayout(3, 2));
		JLabel firstNameLabel = new JLabel("First name : ");
		firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		panelNorth.add(firstNameLabel);
		
		panelNorth.add(nameField);
		JLabel lastNameLabel = new JLabel("Last name : ");
		lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		panelNorth.add(lastNameLabel);
		
		panelNorth.add(lastNameField);
		JLabel phoneLabel = new JLabel("Phone : ");
		phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		panelNorth.add(phoneLabel);
		
		panelNorth.add(phoneField);
		
		
		
		JButton resume = new JButton("Resume");
		resume.addActionListener(this);
		resume.setActionCommand("resume");
		JButton quit = new JButton("Quit");
		quit.addActionListener(this);
		quit.setActionCommand("quit");
		panelSouth.setLayout(new FlowLayout());
		panelSouth.add(resume);
		panelSouth.add(quit);
		
		panelGeneral.setLayout(new BorderLayout());
		panelGeneral.add(panelNorth, BorderLayout.NORTH);
		panelGeneral.add(panelCenter, BorderLayout.CENTER);
		panelGeneral.add(panelSouth, BorderLayout.SOUTH);
		this.add(panelGeneral);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		
		descriptionArea.setVisible(true);
		panelCenter.add(descriptionArea);
		pack();
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		
		MainWindow mw = new MainWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("quit")){
			this.setVisible(false);
			System.exit(0);
		}
		if(e.getActionCommand().equals("resume")){
			String name = this.nameField.getText();
			name = name+" "+this.lastNameField.getText()+" "+this.phoneField.getText();
			this.descriptionArea.setText(name);
		}
	}


}
