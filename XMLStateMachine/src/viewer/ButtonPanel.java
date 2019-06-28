package viewer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Field;
import model.State;

import controller.UpdateEvent;
import controller.UpdateListener;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ButtonPanel extends JPanel implements UpdateListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public State currentState;

	private FieldPanel currFieldPanel;
	private JButton btnFirst;
	private JButton btnSecond;
	private JButton btnClose;

	public ButtonPanel(FieldPanel f) {
		this.currFieldPanel = f;
		setLayout(new BorderLayout());
		this.currentState = model.Main.d.getCurrentState();

		btnFirst = new JButton(model.Main.d.getCurrentState().getActions().get(0).getLabel().toString());
		btnSecond = new JButton("s");
		btnClose = new JButton("Close");
		btnClose.setVisible(false);
		btnSecond.setVisible(false);
		
		btnFirst.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean ok = validation();
				if(ok)
					model.Main.d.refreshFormSucceed(1);
				else {
					String message = "Mandatory fields must be filled!";
					JOptionPane.showMessageDialog(new JFrame(), message, "Warning", JOptionPane.ERROR_MESSAGE);
					model.Main.d.refreshFormFail(1);
				}
			}
		});
		
		btnSecond.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean ok = validation();
				if(ok)
					model.Main.d.refreshFormSucceed(2);
				else {
					String message = "Mandatory fields must be filled!";
					JOptionPane.showMessageDialog(new JFrame(), message, "Warning", JOptionPane.ERROR_MESSAGE);
					model.Main.d.refreshFormFail(2);
				}
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		add(btnSecond, BorderLayout.SOUTH);
		add(btnClose, BorderLayout.CENTER);
		add(btnFirst, BorderLayout.NORTH);

	}
	
	public boolean validation() {
		boolean ok = this.currFieldPanel.check(this.currentState);
		return ok;
	}

	@Override
	public void updatePerformed(UpdateEvent e) {
		this.currentState = e.getCurrentState();
		
		if(this.currentState.getEntityId() == 7) {
			btnFirst.setVisible(false);
			btnSecond.setVisible(false);
			btnClose.setVisible(true);
		}

		if (this.currentState.getActions().size() == 1) {
			btnFirst.setText(this.currentState.getActions().get(0).getLabel());
			btnSecond.setVisible(false);
		} 
		
		if (this.currentState.getActions().size() == 2) {
			btnFirst.setText(this.currentState.getActions().get(0).getLabel());
			btnSecond.setText(this.currentState.getActions().get(1).getLabel());
			btnSecond.setVisible(true);
		}
	}
}
