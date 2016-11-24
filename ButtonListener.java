import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String actionCommand = e.getActionCommand();
		//System.out.println("avant substring : "+actionCommand);
		actionCommand = actionCommand.substring(6, actionCommand.length());
		//System.out.println("apres substring : "+actionCommand);
		int btn_number = Integer.parseInt(actionCommand);
		for(int i=0; i<btn_number; i++){
			System.out.print("*");
		}
		System.out.println("\n");
		
	}

}
