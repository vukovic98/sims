package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;

import viewer.ChooseFrame;

public class Main {
	
	
	public static Document d = new Document();

	public static void main(String[] args) {
	
		ChooseFrame window = new ChooseFrame();
		
		window.setVisible(true);	
		
	}
}
