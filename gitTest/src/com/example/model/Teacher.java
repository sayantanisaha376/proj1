package com.example.model;

public class Teacher {
	private String tname;
	private String subject;
	private boolean mode;
	private College college;

	public Teacher(String tname, String subject, boolean mode, College college) {
		super();
		this.tname = tname;
		this.subject = subject;
		this.mode = mode;
		this.college = college;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isMode() {
		return mode;
	}

	public void setMode(boolean mode) {
		this.mode = mode;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

}
