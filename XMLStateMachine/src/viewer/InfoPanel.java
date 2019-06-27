package viewer;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.UpdateEvent;
import controller.UpdateListener;

public class InfoPanel extends JPanel implements UpdateListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lblId;
	private JLabel lblStateName;
	private JLabel lblDocumentType;
	
	public InfoPanel() {
		setLayout(new GridBagLayout());
		
		lblId = new JLabel("State ID: " + model.Main.d.getCurrentState().getEntityId());
		lblStateName = new JLabel("State name: " + model.Main.d.getCurrentState().getDisplayName());
		lblDocumentType = new JLabel("Document type: AccessPermit");
		
		add(lblId, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(lblStateName, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,  5,  5,  5), 0, 0));
		add(lblDocumentType, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
	}

	@Override
	public void updatePerformed(UpdateEvent e) {
		lblId.setText("State ID: " + e.getCurrentState().getEntityId());
		lblStateName.setText("State name: " + e.getCurrentState().getDisplayName());
	}
}
