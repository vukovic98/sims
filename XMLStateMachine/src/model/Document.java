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
	public ArrayList<Field> fields;

	public Document() {
		transitions = new ArrayList<Transition>();
		actions = new ArrayList<Action>();
		fields = new ArrayList<Field>();
	}
	
	public Document(String title, State currentState) {
		super();
		this.title = title;
		this.currentState = currentState;
		transitions = new ArrayList<Transition>();
		actions = new ArrayList<Action>();
		fields = new ArrayList<Field>();
	}

	public void addTransition(Transition t) {
		this.transitions.add(t);
	}

	public Transition findTransition(int idTransition) {
		for (Transition t : this.transitions) {
			if(idTransition == t.getEntityId()) {
				return t;
			}
		}
		return null;
	}

	public void deleteTransition(int idTransition) {
		for (Transition t : this.transitions) {
			if(idTransition == t.getEntityId()) {
				this.transitions.remove(t);
				break;
			}
		}
	}

	public void addField(Field f) {
		this.fields.add(f);
	}

	public Field findField(String name) {
		for (Field f : this.fields) {
			if(name.equalsIgnoreCase(f.getName())) {
				return f;
			}
		}
		return null;
	}

	public void deleteField(String name) {
		for (Field f : this.fields) {
			if(name.equalsIgnoreCase(f.getName())) {
				this.fields.remove(f);
				break;
			}
		}
	}

	public void addAction(Action a) {
		this.actions.add(a);
	}

	public Action findAction(String name) {
		for (Action a : this.actions) {
			if(name.equalsIgnoreCase(a.getName())) {
				return a;
			}
		}
		return null;
	}

	public void deleteAction(String name) {
		for (Action a : this.actions) {
			if(name.equalsIgnoreCase(a.getName())) {
				this.actions.remove(a);
				break;
			}
		}
	}

	public State changeState(State newState) {
		this.currentState = newState;
		return this.currentState;
	}

}