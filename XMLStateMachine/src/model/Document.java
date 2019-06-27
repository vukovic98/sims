/***********************************************************************
 * Module:  Document.java
 * Author:  Vladimir
 * Purpose: Defines the Class Document
 ***********************************************************************/
package model;

import java.util.ArrayList;
import java.util.List;

import controller.UpdateListener;
import controller.UpdateEvent;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Transition> getTransitions() {
		return transitions;
	}

	public void setTransitions(ArrayList<Transition> transitions) {
		this.transitions = transitions;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public ArrayList<Action> getActions() {
		return actions;
	}

	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}

	public ArrayList<Field> getFields() {
		return fields;
	}

	public void setFields(ArrayList<Field> fields) {
		this.fields = fields;
	}

	public void addTransition(Transition t) {
		this.transitions.add(t);
	}

	public Transition findTransition(int idTransition) {
		for (Transition t : this.transitions) {
			if (idTransition == t.getEntityId()) {
				return t;
			}
		}
		return null;
	}

	public void deleteTransition(Transition t) {
		this.transitions.remove(t);
	}

	public void addField(Field f) {
		this.fields.add(f);
	}

	public Field findField(String name) {
		for (Field f : this.fields) {
			if (name.equalsIgnoreCase(f.getName())) {
				return f;
			}
		}
		return null;
	}

	public void deleteField(Field f) {
		this.fields.remove(f);
	}

	public void addAction(Action a) {
		this.actions.add(a);
	}

	public Action findAction(String name) {
		for (Action a : this.actions) {
			if (name.equalsIgnoreCase(a.getName())) {
				return a;
			}
		}
		return null;
	}

	public void deleteAction(Action a) {
		this.actions.remove(a);
	}

	public State changeState(State newState) {
		this.currentState = newState;
		return this.currentState;
	}
	
	private List<UpdateListener> listeners = new ArrayList<UpdateListener>();
	
	public void addListener(UpdateListener listener) {
		listeners.add(listener);
	}
		
	public void removeListener(UpdateListener listener) {
		listeners.remove(listener);
	}
	
	public void nextState(int id, boolean succeed) {
		int br = 0;
		if(succeed) {
			for (Transition t : this.currentState.getTransitions()) {
				if(t.getStartState() == this.currentState) {
					if(++br == id) {
						changeState(t.getTransitionOnSucceed());
					}
				}
			}
		} else {
			for (Transition t : this.currentState.getTransitions()) {
				if(t.getStartState() == this.currentState) {
					if(++br == id) {
						changeState(t.getTransitionOnFail());
					}
				}
			}
		}
	}
	
	public void refreshFormSucceed(int id) {
		nextState(id, true);
		UpdateEvent e = new UpdateEvent(this, this.currentState);
		for (UpdateListener updateListener : listeners) {
			updateListener.updatePerformed(e);
		}
	}
	
	public void refreshFormFail(int id) {
		nextState(id, false);
		UpdateEvent e = new UpdateEvent(this, this.currentState);
		for (UpdateListener updateListener : listeners) {
			updateListener.updatePerformed(e);
		}
	}

}