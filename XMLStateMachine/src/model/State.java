/***********************************************************************
 * Module:  State.java
 * Author:  Vladimir
 * Purpose: Defines the Class State
 ***********************************************************************/

package model;

import java.util.ArrayList;


public class State {
	private String lifecycleName;
	private String displayName;
	private String entityName;
	private ArrayList<StateSemantics> stateSemantic;
	private int entityId;

	public ArrayList<Field> stateDenyModifyingFields;
	public ArrayList<Field> stateHideFields;
	public ArrayList<Field> stateMandatoryFields;
	public ArrayList<Action> actions;
	public ArrayList<Transition> transitions;

	public State() {
		super();
	}

	public State(String lifecycleName, String displayName, String entityName, int entityId) {
		super();
		this.lifecycleName = lifecycleName;
		this.displayName = displayName;
		this.entityName = entityName;
		this.entityId = entityId;

		this.stateDenyModifyingFields = new ArrayList<>();
		this.stateHideFields = new ArrayList<>();
		this.stateMandatoryFields = new ArrayList<>();
		this.actions = new ArrayList<>();
		this.stateSemantic = new ArrayList<>();
		this.transitions = new ArrayList<Transition>();
	}

	
	public ArrayList<Transition> getTransitions() {
		return transitions;
	}

	public void setTransitions(ArrayList<Transition> transitions) {
		this.transitions = transitions;
	}

	public String getLifecycleName() {
		return lifecycleName;
	}

	public void setLifecycleName(String lifecycleName) {
		this.lifecycleName = lifecycleName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public ArrayList<StateSemantics> getStateSemantic() {
		return stateSemantic;
	}

	public void setStateSemantic(ArrayList<StateSemantics> stateSemantic) {
		this.stateSemantic = stateSemantic;
	}

	public int getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public ArrayList<Field> getStateDenyModifyingFields() {
		return stateDenyModifyingFields;
	}

	public void setStateDenyModifyingFields(ArrayList<Field> stateDenyModifyingFields) {
		this.stateDenyModifyingFields = stateDenyModifyingFields;
	}

	public ArrayList<Field> getStateHideFields() {
		return stateHideFields;
	}

	public void setStateHideFields(ArrayList<Field> stateHideFields) {
		this.stateHideFields = stateHideFields;
	}

	public ArrayList<Field> getStateMandatoryFields() {
		return stateMandatoryFields;
	}

	public void setStateMandatoryFields(ArrayList<Field> stateMandatoryFields) {
		this.stateMandatoryFields = stateMandatoryFields;
	}

	public ArrayList<Action> getActions() {
		return actions;
	}

	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}

	public void addDenyModifyingField(Field f) {
		this.stateDenyModifyingFields.add(f);
	}

	public void addHideField(Field f) {
		this.stateHideFields.add(f);
	}

	public void addMandatoryField(Field f) {
		this.stateMandatoryFields.add(f);
	}
	
	public void addSemantic(StateSemantics c) {
		this.stateSemantic.add(c);
	}

	public Field findDenyModifyingField(String name) {
		for (Field f : this.stateDenyModifyingFields) {
			if (f.getName().equalsIgnoreCase(name))
				return f;
		}
		return null;
	}

	public Field findHideField(String name) {
		for (Field f : this.stateHideFields) {
			if (f.getName().equalsIgnoreCase(name))
				return f;
		}
		return null;
	}

	public Field findMandatoryField(String name) {
		for (Field f : this.stateMandatoryFields) {
			if (f.getName().equalsIgnoreCase(name))
				return f;
		}
		return null;
	}

	public void deleteDenyModifyingField(Field f) {
		this.stateDenyModifyingFields.remove(f);
	}

	public void deleteHideField(Field f) {
		this.stateHideFields.remove(f);
	}

	public void deleteMandatoryField(Field f) {
		this.stateMandatoryFields.remove(f);
	}

	public void addAction(Action a) {
		this.actions.add(a);
	}

	public Action findAction(String name) {
		for (Action a : this.actions) {
			if (a.getName().equalsIgnoreCase(name))
				return a;
		}
		return null;
	}

	public void deleteAction(Action a) {
		this.actions.remove(a);
	}
	
	public void addTransition(Transition t) {
		this.transitions.add(t);
	}
	
	public void deleteTransition(Transition t) {
		this.transitions.remove(t);
	}
	
	public Transition findTransition(int id) {
		for (Transition t : this.transitions) {
			if(t.getEntityId() == id)
				return t;
		}
		return null;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(o instanceof State) {
			State temp = (State) o;
			if(temp.getEntityId() == this.getEntityId())
				return true;
			else
				return false;
		} else
			return false;
	}

}