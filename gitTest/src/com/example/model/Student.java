package com.example.model;

public class Student {
	private int roll;
	private String name;
	private String degree;

	public Student() {

	}

	public Student(final int roll, final String name, final String degree) {
		super();
		this.roll = roll;
		this.name = name;
		this.degree = degree;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(final int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(final String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", degree=" + degree + "]";
	}

}
