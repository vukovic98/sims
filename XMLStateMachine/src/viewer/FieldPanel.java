package viewer;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FieldPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lblStatus;
	private JLabel lblName;
	private JLabel lblDateTime;
	private JLabel lblAnswers;
	private JLabel lblRevNo;
	private JLabel lblPrevState;
	private JLabel lblDenyReason;
	private JLabel lblEquip;
	private JLabel lblPoints;
	private JLabel lblPhoneNo;

	private JTextField txtStatus;
	private JTextField txtName;
	private JTextField txtDateTime;
	private JTextField txtAnswers;
	private JTextField txtRevNo;
	private JTextField txtPrevState;
	private JTextField txtDenyReason;
	private JTextField txtEquip;
	private JTextField txtPoints;
	private JTextField txtPhoneNo;
	
	public FieldPanel()
	{
		setLayout(new GridBagLayout());
		lblStatus = new JLabel("Status: ");
		lblName = new JLabel("Name: ");
		lblDateTime = new JLabel("Date and time: ");
		lblAnswers = new JLabel("Answers: ");
		lblRevNo = new JLabel("Revision number: ");
		lblPrevState = new JLabel("Previous state: ");
		lblDenyReason = new JLabel("Denial reason: ");
		lblEquip = new JLabel("Equipment: ");
		lblPoints = new JLabel("Points: ");
		lblPhoneNo = new JLabel("Phone number: ");
		
		txtStatus = new JTextField(20);
		txtName = new JTextField(20);
		txtDateTime = new JTextField(20);
		txtAnswers = new JTextField(20);
		txtRevNo = new JTextField(20);
		txtPrevState = new JTextField(20);
		txtDenyReason = new JTextField(20);
		txtEquip = new JTextField(20);
		txtPoints = new JTextField(20);
		txtPhoneNo = new JTextField(20);
		
		add(lblStatus, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(txtStatus, new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(lblName, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(txtName, new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(lblDateTime, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(txtDateTime, new GridBagConstraints(1, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(lblAnswers, new GridBagConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(txtAnswers, new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(lblRevNo, new GridBagConstraints(0, 4, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(txtRevNo, new GridBagConstraints(1, 4, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(lblPrevState, new GridBagConstraints(0, 5, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(txtPrevState, new GridBagConstraints(1, 5, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(lblDenyReason, new GridBagConstraints(0, 6, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(txtDenyReason, new GridBagConstraints(1, 6, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(lblEquip, new GridBagConstraints(0, 7, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(txtEquip, new GridBagConstraints(1, 7, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(lblPoints, new GridBagConstraints(0, 8, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(txtPoints, new GridBagConstraints(1, 8, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(lblPhoneNo, new GridBagConstraints(0, 9, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		add(txtPhoneNo, new GridBagConstraints(1, 9, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		
	}

}
