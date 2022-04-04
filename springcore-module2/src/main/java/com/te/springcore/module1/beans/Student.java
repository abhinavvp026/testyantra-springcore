package com.te.springcore.module1.beans;

import java.io.Serializable;

public class Student implements Serializable {
	private int studentId;
	private String studentName;
	private int studentAge;

	public Student() {
		super();
		System.out.println("default constructor called");
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		System.out.println("argumented constructor called");
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
		System.out.println("setstudentId method");
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("setstudentname method");
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
		System.out.println("setstudentage method");
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

}
