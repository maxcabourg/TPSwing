import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainWindow extends JFrame implements ActionListener{
	
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
		JTextField nameField = new JTextField();
		panelNorth.add(nameField);
		JLabel lastNameLabel = new JLabel("Last name : ");
		lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		panelNorth.add(lastNameLabel);
		JTextField lastNameField = new JTextField();
		panelNorth.add(lastNameField);
		JLabel phoneLabel = new JLabel("Phone : ");
		phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		panelNorth.add(phoneLabel);
		JTextField phoneField = new JTextField();
		panelNorth.add(phoneField);
		
		
		
		JButton resume = new JButton("Resume");
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
		JTextArea descriptionArea = new JTextArea(5, 40);
		System.out.println((int)panelNorth.getSize().getWidth());
		descriptionArea.setVisible(true);
		panelCenter.add(descriptionArea);
		pack();
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow mw = new MainWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("quit")){
			this.setVisible(false);
			System.exit(0);
		}	
	}


}
