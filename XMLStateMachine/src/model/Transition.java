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

	private State startState;
	private State transitionOnSucceed;
	private State transitionOnFail;

	public Transition() {
		super();
	}

	public Transition(int entityId, String lifecycleName, String entityName, State startState,
			State transitionOnSucceed, State transitionOnFail) {
		super();
		this.entityId = entityId;
		this.lifecycleName = lifecycleName;
		this.entityName = entityName;
		this.startState = startState;
		this.transitionOnSucceed = transitionOnSucceed;
		this.transitionOnFail = transitionOnFail;
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

	public State getStartState() {
		return startState;
	}

	public void setStartState(State startState) {
		this.startState = startState;
	}

	public State getTransitionOnSucceed() {
		return transitionOnSucceed;
	}

	public void setTransitionOnSucceed(State transitionOnSucceed) {
		this.transitionOnSucceed = transitionOnSucceed;
	}

	public State getTransitionOnFail() {
		return transitionOnFail;
	}

	public void setTransitionOnFail(State transitionOnFail) {
		this.transitionOnFail = transitionOnFail;
	}

}