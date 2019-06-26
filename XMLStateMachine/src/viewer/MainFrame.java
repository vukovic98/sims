package viewer;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String APP_TITLE = "StateMachine";

	public MainFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(APP_TITLE);
		setSize(400, 450);
		setLocationRelativeTo(null);
		
		MainView mainView = new MainView();
		
		add(mainView);
	}
}
