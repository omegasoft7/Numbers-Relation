package com.NRF;

public class NRFObject {

	//Variables--------------------------------------------
	private String Title;
	private String FieldName;
	private int MaxLength = 0;
	private NRFVariableType VariableType;
	private NRFValueType ValueType;
	
	
	//Variables--------------------------------------------
	public NRFObject(String title, String fieldName, int maxLength, NRFVariableType variableType, NRFValueType valueType) {
		this.Title = title;
		this.FieldName = fieldName;
		this.MaxLength = maxLength;
		this.VariableType = variableType;
		this.ValueType = valueType;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public String getFieldName() {
		return FieldName;
	}
	
	public int getMaxLength() {
		return MaxLength;
	}
	
	public NRFVariableType getVariableType() {
		return VariableType;
	}

	public NRFValueType getValueType() {
		return ValueType;
	}
	
	
}
