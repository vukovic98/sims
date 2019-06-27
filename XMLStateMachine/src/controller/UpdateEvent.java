package controller;

import java.util.EventObject;

import model.State;

public class UpdateEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	State currentState;

	public UpdateEvent(Object o, State c) {
		super(o);
		this.currentState = c;
	}

	public State getCurrentState() {
		return this.currentState;
	}

	public void setCurrentState(State current) {
		this.currentState = current;
	}

}
