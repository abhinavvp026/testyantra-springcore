package com.te.springcore.module1.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student implements Serializable {
	private int studentId;
	private String studentName;
	private int studentAge;
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Student() {
		super();
		System.out.println("student  default constructor");
	}

	public Student(int studentId, String studentName, int studentAge, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.address = address;
		System.out.println("student argumented constructor");
	}

	public Student(Address address) {
		super();
		this.address = address;
		System.out.println("student address constructor in student");
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
		System.out.println("student set id");
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("student set name");
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
		System.out.println("student set age");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("set address in student");
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", address=" + address + "]";
	}

}
