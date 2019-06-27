package viewer;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.UpdateEvent;
import controller.UpdateListener;
import model.State;
import model.Field;

public class FieldPanel extends JPanel implements UpdateListener{

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
	
	public boolean check(State curr) {
		boolean ok = true;
		
		for (Field f : curr.getStateMandatoryFields()) {
			switch(f.getName()) {
			case "ACCESS_PERMIT_STATUS": {
				if(txtStatus.getText().isEmpty())
					ok = false;
				break;
			}
			case "ACCESS_PERMIT_NAME": {
				if(txtName.getText().isEmpty())
					ok = false;
				break;
			}
			case "ACCESS_PERMIT_DATE_TIME": {
				if(txtDateTime.getText().isEmpty())
					ok = false;
			}
			case "ACCESS_PERMIT_ANSWERS": {
				if(txtAnswers.getText().isEmpty())
					ok = false;
				break;
			}
			case "SAFETY_DOCUMENT_REV_NO": {
				if(txtRevNo.getText().isEmpty())
					ok = false;
				break;
			}
			case "ACCESS_PERMIT_PREV_STATE": {
				if(txtPrevState.getText().isEmpty())
					ok = false;
				break;
			}
			case "ACCESS_PERMIT_DENYING_REASON": {
				if(txtDenyReason.getText().isEmpty())
					ok = false;
				break;
			}
			case "ACCESS_PERMIT_EQUIPMENT": {
				if(txtEquip.getText().isEmpty())
					ok = false;
				break;
			}
			case "ACCESS_PERMIT_POINTS": {
				if(txtPoints.getText().isEmpty())
					ok = false;
				break;
			}
			case "ACCESS_PERMIT_PHONE_NO": {
				if(txtPhoneNo.getText().isEmpty())
					ok = false;
				break;
			}
			default: break;
			}
			
			if(!ok)
				break;
		}
		
		return ok;
	}
	
	void refreshForm() {
		txtAnswers.setVisible(true);
		txtDateTime.setVisible(true);
		txtDenyReason.setVisible(true);
		txtEquip.setVisible(true);
		txtName.setVisible(true);
		txtPhoneNo.setVisible(true);
		txtPoints.setVisible(true);
		txtPrevState.setVisible(true);
		txtRevNo.setVisible(true);
		txtStatus.setVisible(true);
		
		txtAnswers.setEditable(true);
		txtDateTime.setEditable(true);
		txtDenyReason.setEditable(true);
		txtEquip.setEditable(true);
		txtName.setEditable(true);
		txtPhoneNo.setEditable(true);
		txtPoints.setEditable(true);
		txtPrevState.setEditable(true);
		txtRevNo.setEditable(true);
		txtStatus.setEditable(true);
		
		lblAnswers.setVisible(true);
		lblDateTime.setVisible(true);
		lblDenyReason.setVisible(true);
		lblEquip.setVisible(true);
		lblName.setVisible(true);
		lblPhoneNo.setVisible(true);
		lblPoints.setVisible(true);
		lblPrevState.setVisible(true);
		lblRevNo.setVisible(true);
		lblStatus.setVisible(true);
		
		if(lblAnswers.getText().contains("*"))
			lblAnswers.setText(lblAnswers.getText().split("\\*")[1].trim());
		if(lblDateTime.getText().contains("*"))
			lblDateTime.setText(lblDateTime.getText().split("\\*")[1].trim());
		if(lblDenyReason.getText().contains("*"))
			lblDenyReason.setText(lblDenyReason.getText().split("\\*")[1].trim());
		if(lblEquip.getText().contains("*"))
			lblEquip.setText(lblEquip.getText().split("\\*")[1].trim());
		if(lblName.getText().contains("*"))
			lblName.setText(lblName.getText().split("\\*")[1].trim());
		if(lblPhoneNo.getText().contains("*"))
			lblPhoneNo.setText(lblPhoneNo.getText().split("\\*")[1].trim());
		if(lblPoints.getText().contains("*"))
			lblPoints.setText(lblPoints.getText().split("\\*")[1].trim());
		if(lblPrevState.getText().contains("*"))
			lblPrevState.setText(lblPrevState.getText().split("\\*")[1].trim());
		if(lblRevNo.getText().contains("*"))
			lblRevNo.setText(lblRevNo.getText().split("\\*")[1].trim());
		if(lblStatus.getText().contains("*"))
			lblStatus.setText(lblStatus.getText().split("\\*")[1].trim());
	}

	@Override
	public void updatePerformed(UpdateEvent e) {
		State curr = e.getCurrentState();
		
		refreshForm();
		
		for (Field f : curr.getStateDenyModifyingFields()) {
			switch(f.getName()) {
			case "ACCESS_PERMIT_STATUS": {
				txtStatus.setEditable(false);
				break;
			}
			case "ACCESS_PERMIT_NAME": {
				txtName.setEditable(false);
				break;
			}
			case "ACCESS_PERMIT_DATE_TIME": {
				txtDateTime.setEditable(false);
			}
			case "ACCESS_PERMIT_ANSWERS": {
				txtAnswers.setEditable(false);
				break;
			}
			case "SAFETY_DOCUMENT_REV_NO": {
				txtRevNo.setEditable(false);
				break;
			}
			case "ACCESS_PERMIT_PREV_STATE": {
				txtPrevState.setEditable(false);
				break;
			}
			case "ACCESS_PERMIT_DENYING_REASON": {
				txtDenyReason.setEditable(false);
				break;
			}
			case "ACCESS_PERMIT_EQUIPMENT": {
				txtEquip.setEditable(false);
				break;
			}
			case "ACCESS_PERMIT_POINTS": {
				txtPoints.setEditable(false);
				break;
			}
			case "ACCESS_PERMIT_PHONE_NO": {
				txtPhoneNo.setEditable(false);
				break;
			}
			default: break;
			}
		}
		
		for (Field f : curr.getStateHideFields()) {
			switch(f.getName()) {
			case "ACCESS_PERMIT_STATUS": {
				txtStatus.setVisible(false);
				lblStatus.setVisible(false);
				break;
			}
			case "ACCESS_PERMIT_NAME": {
				txtName.setVisible(false);
				lblName.setVisible(false);
				break;
			}
			case "ACCESS_PERMIT_DATE_TIME": {
				txtDateTime.setVisible(false);
				lblDateTime.setVisible(false);
			}
			case "ACCESS_PERMIT_ANSWERS": {
				txtAnswers.setVisible(false);
				lblAnswers.setVisible(false);
				break;
			}
			case "SAFETY_DOCUMENT_REV_NO": {
				txtRevNo.setVisible(false);
				lblRevNo.setVisible(false);
				break;
			}
			case "ACCESS_PERMIT_PREV_STATE": {
				txtPrevState.setVisible(false);
				lblPrevState.setVisible(false);
				break;
			}
			case "ACCESS_PERMIT_DENYING_REASON": {
				txtDenyReason.setVisible(false);
				lblDenyReason.setVisible(false);
				break;
			}
			case "ACCESS_PERMIT_EQUIPMENT": {
				txtEquip.setVisible(false);
				lblEquip.setVisible(false);
				break;
			}
			case "ACCESS_PERMIT_POINTS": {
				txtPoints.setVisible(false);
				lblPoints.setVisible(false);
				break;
			}
			case "ACCESS_PERMIT_PHONE_NO": {
				txtPhoneNo.setVisible(false);
				lblPhoneNo.setVisible(false);
				break;
			}
			default: break;
			}
		}
		
		for (Field f : curr.getStateMandatoryFields()) {
			switch(f.getName()) {
			case "ACCESS_PERMIT_STATUS": {
				lblStatus.setText("* " + lblStatus.getText());
				break;
			}
			case "ACCESS_PERMIT_NAME": {
				lblName.setText("* " + lblName.getText());
				break;
			}
			case "ACCESS_PERMIT_DATE_TIME": {
				lblDateTime.setText("* " + lblDateTime.getText());
			}
			case "ACCESS_PERMIT_ANSWERS": {
				lblAnswers.setText("* " + lblAnswers.getText());
				break;
			}
			case "SAFETY_DOCUMENT_REV_NO": {
				lblRevNo.setText("* " + lblRevNo.getText());
				break;
			}
			case "ACCESS_PERMIT_PREV_STATE": {
				lblPrevState.setText("* " + lblPrevState.getText());
				break;
			}
			case "ACCESS_PERMIT_DENYING_REASON": {
				lblDenyReason.setText("* " + lblDenyReason.getText());
				break;
			}
			case "ACCESS_PERMIT_EQUIPMENT": {
				lblEquip.setText("* " + lblEquip.getText());
				break;
			}
			case "ACCESS_PERMIT_POINTS": {
				lblPoints.setText("* " + lblPoints.getText());
				break;
			}
			case "ACCESS_PERMIT_PHONE_NO": {
				lblPhoneNo.setText("* " + lblPhoneNo.getText());
				break;
			}
			default: break;
			}
		}
	}

}
