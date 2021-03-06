package com.te.springcore.module1.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Set;


public class Student implements Serializable {
	private int studentId;
	private String studentName;
	private int studentAge;
	private Address address;
	private List<String> friendList;
	private Set<Integer> luckyNumbers;

	public Student() {
		super();
		System.out.println("student constructor");
	}

	





	public Student(int studentId, String studentName, int studentAge, Address address, List<String> friendList,
			Set<Integer> luckyNumbers) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.address = address;
		this.friendList = friendList;
		this.luckyNumbers = luckyNumbers;
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
	}


	public List<String> getFreindList() {
		return friendList;
	}



	public void setFriendList(List<String> freindList) {
		this.friendList = freindList;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ",\n studentName=" + studentName + ",\n studentAge=" + studentAge
				+ ",\n address=" + address + ",\n friendList=" + friendList + ",\n luckynumbers="+luckyNumbers+"]";
	}



	public Set<Integer> getLuckyNumbers() {
		return luckyNumbers;
	}



	public void setLuckyNumbers(Set<Integer> luckyNumbers) {
		this.luckyNumbers = luckyNumbers;
	}
	

}
