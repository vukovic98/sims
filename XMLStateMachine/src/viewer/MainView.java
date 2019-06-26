package viewer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

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
		
		pnlFields = new JPanel(new GridBagLayout());

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
		
		
		pnlButtons.add(btnFirst, BorderLayout.NORTH);
		pnlButtons.add(btnSecond, BorderLayout.SOUTH);
		
		add(pnlInfo, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.FIRST_LINE_START, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		add(pnlButtons, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.FIRST_LINE_END, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 25));
		
		pnlFields.add(lblStatus, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlFields.add(txtStatus, new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		pnlFields.add(lblName, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlFields.add(txtName, new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		pnlFields.add(lblDateTime, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlFields.add(txtDateTime, new GridBagConstraints(1, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		pnlFields.add(lblAnswers, new GridBagConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlFields.add(txtAnswers, new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		pnlFields.add(lblRevNo, new GridBagConstraints(0, 4, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlFields.add(txtRevNo, new GridBagConstraints(1, 4, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		pnlFields.add(lblPrevState, new GridBagConstraints(0, 5, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlFields.add(txtPrevState, new GridBagConstraints(1, 5, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		pnlFields.add(lblDenyReason, new GridBagConstraints(0, 6, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlFields.add(txtDenyReason, new GridBagConstraints(1, 6, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		pnlFields.add(lblEquip, new GridBagConstraints(0, 7, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlFields.add(txtEquip, new GridBagConstraints(1, 7, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		pnlFields.add(lblPoints, new GridBagConstraints(0, 8, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlFields.add(txtPoints, new GridBagConstraints(1, 8, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		pnlFields.add(lblPhoneNo, new GridBagConstraints(0, 9, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 40, 5), 0, 0));
		pnlFields.add(txtPhoneNo, new GridBagConstraints(1, 9, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 40, 5), 0, 0));
		
		add(pnlFields, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.PAGE_END, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
	}
	
}


