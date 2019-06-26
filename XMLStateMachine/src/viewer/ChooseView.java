package viewer;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.thoughtworks.xstream.XStream;



public class ChooseView extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String path;
	
	private JPanel pnlContent;
	private JLabel lblPath;
	private JTextField txtPath;
	
	private JPanel pnlOk;
	private JButton btnOK;
	private JButton btnCancel;
	
	public ChooseView() {
		initGUI();
		constructGUI();
	}
	
	void initGUI() {		
		setLayout(new BorderLayout());
		
		pnlContent = new JPanel(new GridBagLayout());
		pnlOk = new JPanel(new GridBagLayout());
		
		lblPath = new JLabel("File: ");
		txtPath = new JTextField(20);
		
		btnOK = new JButton("Ok");
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				submit();
			}
		});
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cancel();
			}
		});
	}
	
	void constructGUI() {
		pnlContent.add(lblPath, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(txtPath, new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,  5,  5,  5), 0, 0));
		
		pnlOk.add(btnOK, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlOk.add(btnCancel, new GridBagConstraints(3, 0, 1, 1, 0, 0, GridBagConstraints.WEST, 
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		
		add(pnlContent, BorderLayout.CENTER);
		add(pnlOk, BorderLayout.SOUTH);
	}
	
	void submit() {
		XStream xs = new XStream();
		
		xs.fromXML(new File(txtPath.getText()), model.Main.d);
		
		MainFrame mFrame = new MainFrame();
		mFrame.setVisible(true);
	}
	
	void cancel() {
		System.exit(0);
	}
}
