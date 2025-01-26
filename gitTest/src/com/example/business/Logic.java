package com.example.business;

import com.example.model.Student;
import com.example.model.Teacher;

public class Logic {

	public static void teachAStudent(Student s) {
		System.out.println("I am teaching " + s.getName() + " with degree " + s.getDegree());
	}

	public static void teachUnderFaculty(Teacher t) {
		System.out.println("I am learning under " + t.getTname() + " subject is  " + t.getSubject()
				+ " from the college " + t.getCollege().getName() + " under the university " + t.getCollege().getUni());
	}

	public static void situation(Teacher t, Student[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println("the teacher " + t.getTname() + " is teaching " + s[i].getName() + " in the subject "
					+ t.getSubject());
		}

	}
}
