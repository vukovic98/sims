package controller;

import java.util.EventListener;


public interface UpdateListener extends EventListener {
	
	public void updatePerformed(UpdateEvent e);
}
