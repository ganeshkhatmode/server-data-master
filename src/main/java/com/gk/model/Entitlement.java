package com.gk.model;

import org.springframework.stereotype.Component;

@Component
public class Entitlement {

	private long id;
	private String value;
	private String operation;
	public Entitlement() {
		super();
	}
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}


	@Override
	public String toString() {
		return "Entitlement [id=" + id + ", value=" + value + ", operation=" + operation + "]";
	}
	
	
}
