/***********************************************************************
 * Module:  Field.java
 * Author:  Vladimir
 * Purpose: Defines the Class Field
 ***********************************************************************/
package model;

public class Field {
	private String name;
	private String dataType;
	private String label;

	public Field() {
		super();
	}

	public Field(String name, String dataType, String label) {
		super();
		this.name = name;
		this.dataType = dataType;
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}