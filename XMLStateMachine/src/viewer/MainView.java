package viewer;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainView extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3018696746928226635L;

	private JPanel pnlInfo;
	private JPanel pnlButtons;
	private JPanel pnlFields;

	private JLabel lblId;
	private JLabel lblStateName;
	private JLabel lblDocumentType;
	
	private JButton btnFirst;
	private JButton btnSecond;
	
	public MainView() {
		initGUI();
		constructGUI();
	}
	
	public void initGUI() {
		setLayout(new GridBagLayout());
		
		pnlInfo = new JPanel(new GridBagLayout());
		pnlButtons = new JPanel(new BorderLayout());
		
		lblId = new JLabel("State ID: ");
		lblStateName = new JLabel("State name: ");
		lblDocumentType = new JLabel("Document type: AccessPermit");
		
		btnFirst = new JButton("f");
		btnSecond = new JButton("s");
	}
	
	public void constructGUI() {
		pnlInfo.add(lblId, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlInfo.add(lblStateName, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,  5,  5,  5), 0, 0));
		pnlInfo.add(lblDocumentType, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		/*pnlInfo.add(btnFirst, new GridBagConstraints(7, 0, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,  5,  5,  5), 0, 0));
		pnlInfo.add(btnSecond, new GridBagConstraints(7, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));*/
		
		pnlButtons.add(btnFirst, BorderLayout.NORTH);
		pnlButtons.add(btnSecond, BorderLayout.SOUTH);
		
		add(pnlInfo, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.FIRST_LINE_START, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(pnlButtons, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.FIRST_LINE_END, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 25));
	}
	
}
