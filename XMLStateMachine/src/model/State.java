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

	public State(String lifecycleName, String displayName, String entityName, ArrayList<StateSemantics> stateSemantic,
			int entityId) {
		super();
		this.lifecycleName = lifecycleName;
		this.displayName = displayName;
		this.entityName = entityName;
		this.stateSemantic = stateSemantic;
		this.entityId = entityId;
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

	public void addField(Field f) {
		
	}

	public Field findField(String name) {
		// TODO: implement
		return null;
	}

	public void deleteField(Field f) {
		// TODO: implement
	}

	public void addAction(Action a) {
		this.actions.add(a);
	}

	public Action findAction(String name) {
		for (Action a : this.actions) {
			if(a.getName())
		}
		return null;
	}

	public void deleteAction(Action a) {
		// TODO: implement
	}

}