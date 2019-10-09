package com.instantor.dap.springbootbackend.model;

public class StarWarsCharacter {
	private String name;
	
	public StarWarsCharacter(String theName) {
		name = theName;
	}
	
	public void setName(String theName) {
		name = theName;
	}
	public String getName() {
		return name;
	}
}
