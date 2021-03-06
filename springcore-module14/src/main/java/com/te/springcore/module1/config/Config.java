package com.te.springcore.module1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.te.springcore.module1.beans.Address;
import com.te.springcore.module1.beans.Student;

public class Config {
	@Bean(name = "student")
	public Student getStudentObj() {
		System.out.println("getstudentobj in config");
		Student student = new Student();
		student.setStudentId(01);
		student.setStudentName("abhinav");
		student.setStudentAge(22);
		return student;

	}

	@Bean(name = "address")
	public Address getAddressObj1() {
		System.out.println("getaddressobj in config");
		Address address = new Address();
		address.setId(011);
		address.setCity("banglore");
		address.setState("KARNATAKA");
		return address;
	}

	@Bean(name = "address2")
	@Primary
	public Address getAddressObj2() {
		System.out.println("getaddressobj in config");
		Address address = new Address();
		address.setId(011);
		address.setCity("mysore");
		address.setState("KARNATAKA");
		return address;
	}

	@Bean(name = "address1")
	public Address getAddressObj() {
		System.out.println("getaddressobj in config");
		Address address = new Address();
		address.setId(011);
		address.setCity("kannur");
		address.setState("Kerala");
		return address;
	}

}
