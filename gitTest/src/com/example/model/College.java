package com.example.model;

public class College {
	private String name;
	private String uni;

	public College(String name, String uni) {
		super();
		this.name = name;
		this.uni = uni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

}
