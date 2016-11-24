import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.*;


public class Boutons extends JFrame implements ActionListener, KeyListener{

	private int nb_boutons;
	private ArrayList<JButton> button_array;
	public Boutons(int nb_boutons){
		this.nb_boutons = nb_boutons;
		this.button_array = new ArrayList<JButton>(nb_boutons);
		JPanel jp = new JPanel();
		for(int i = 0; i < nb_boutons; i++){
			JButton button = new JButton("BUTTON"+(i+1));
			button_array.add(button);
			button.addActionListener(new ButtonListener());
			button.setActionCommand("bouton"+(i+1));
			button.addKeyListener(this);
			jp.add(button);
		}
		this.add(jp);
		pack();
		setVisible(true);
	}

	public static void main(String[] args){
		Boutons bt = new Boutons(Integer.parseInt(args[0]));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		JButton buttonPressed = (JButton) obj;
		System.out.println(buttonPressed.getText());
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int button_index = (int)(arg0.getKeyChar())-49;
		System.out.println(button_index);
		this.button_array.get(button_index).requestFocus();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}