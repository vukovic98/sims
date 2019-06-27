package viewer;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lblId;
	private JLabel lblStateName;
	private JLabel lblDocumentType;
	
	public InfoPanel() {
		setLayout(new GridBagLayout());
		
		lblId = new JLabel("State ID: ");
		lblStateName = new JLabel("State name: ");
		lblDocumentType = new JLabel("Document type: AccessPermit");
		
		add(lblId, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(lblStateName, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,  5,  5,  5), 0, 0));
		add(lblDocumentType, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
	}
}
