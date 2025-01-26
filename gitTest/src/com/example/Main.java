package com.example;

import com.example.business.Logic;
import com.example.model.College;
import com.example.model.Student;
import com.example.model.Teacher;

public class Main {

	public static void main(String[] args) {
		Teacher t = new Teacher("amitava", "java", true, new College("UEM", "AUTO"));
		Student s = new Student();
		s.setName("Tomojit");
		s.setDegree("BTECH");
		s.setRoll(10);

		Logic.teachAStudent(s);
		Logic.teachUnderFaculty(t);

		System.out.println("======================");
		Student ss[] = { new Student(1, "a", "bca"), new Student(11, "t", "PHD"), new Student(12, "b", "mca"),
				new Student(13, "c", "bba"), new Student(14, "d", "btech") };

		Logic.situation(t, ss);

	}

}
