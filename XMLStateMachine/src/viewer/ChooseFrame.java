package viewer;

import javax.swing.JFrame;

public class ChooseFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static final String APP_TITLE = "Choose file";

	public ChooseFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(APP_TITLE);
		setSize(350, 150);
		setLocationRelativeTo(null);
		
		ChooseView chooseView = new ChooseView();
		
		add(chooseView);
	}
}
