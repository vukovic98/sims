/***********************************************************************
 * Module:  Action.java
 * Author:  Vladimir
 * Purpose: Defines the Class Actions
 ***********************************************************************/
package model;

public class Action {
	private String name;
	private String label;

	public Action() {
		super();
	}

	public Action(String name, String label) {
		super();
		this.name = name;
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}