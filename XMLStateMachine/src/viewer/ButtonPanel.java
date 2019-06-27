package viewer;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton btnFirst;
	private JButton btnSecond;
	
	public ButtonPanel()
	{
		setLayout(new BorderLayout());
		
		btnFirst = new JButton("f");
		btnSecond = new JButton("s");
		
		add(btnFirst, BorderLayout.NORTH);
		add(btnSecond, BorderLayout.SOUTH);
		
		
	}
}
