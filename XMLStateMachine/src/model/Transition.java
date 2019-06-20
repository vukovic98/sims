/***********************************************************************
 * Module:  Transition.java
 * Author:  Vladimir
 * Purpose: Defines the Class Transition
 ***********************************************************************/

package model;

public class Transition {
	private int entityId;
	private String lifecycleName;
	private String entityName;

	public State state;

	public Transition(int entityId, String lifecycleName, String entityName, State state) {
		super();
		this.entityId = entityId;
		this.lifecycleName = lifecycleName;
		this.entityName = entityName;
		this.state = state;
	}

	public int getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getLifecycleName() {
		return lifecycleName;
	}

	public void setLifecycleName(String lifecycleName) {
		this.lifecycleName = lifecycleName;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}