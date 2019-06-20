/***********************************************************************
 * Module:  Document.java
 * Author:  Vladimir
 * Purpose: Defines the Class Document
 ***********************************************************************/
package model;

import java.util.ArrayList;

public class Document {
	private String title;

	public ArrayList<Transition> transitions;
	public State currentState;
	public ArrayList<Action> actions;
	public ArrayList<Field> field;

	public Document(String title, ArrayList<Transition> transitions, State currentState, ArrayList<Action> actions,
			ArrayList<Field> field) {
		super();
		this.title = title;
		this.transitions = transitions;
		this.currentState = currentState;
		this.actions = actions;
		this.field = field;
	}

	public void addTransition(Transition t) {
		this.transitions.add(t);
	}

	public Transition findTransition(int idTransition) {
		for (Transition t : this.transitions) {
			
		}
		return null;
	}

	public void deleteTransition(Transition t) {
		// TODO: implement
	}

	public void addField(Field f) {
		// TODO: implement
	}

	public Field findField(String name) {
		// TODO: implement
		return null;
	}

	public void deleteField(Field f) {
		// TODO: implement
	}

	public void addAction(Action a) {
		// TODO: implement
	}

	public Action findAction(String name) {
		// TODO: implement
		return null;
	}

	public void deleteAction(Action a) {
		// TODO: implement
	}

	public State changeState(State newState) {
		// TODO: implement
		return null;
	}

}