package model;

import java.io.File;

import javax.swing.JDialog;
import javax.swing.JFrame;

import com.thoughtworks.xstream.XStream;

import viewer.ChooseView;

public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String APP_TITLE = "Choose file";

	public MainFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(APP_TITLE);
		setSize(350, 150);
		setLocationRelativeTo(null);
		
		ChooseView chooseView = new ChooseView();
		
		add(chooseView);
	}
	
	public static Document d = new Document();

	public static void main(String[] args) {
	
		MainFrame window = new MainFrame();
		
		window.setVisible(true);
		
	}

}
