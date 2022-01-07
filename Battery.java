package com.te.springautowaire;

public class Battery {

	String name = "Toshiba";

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Battery [name=" + name + "]";
	}

	
}
