package com.te.springcore.module1.config;

import org.springframework.context.annotation.Bean;

import com.te.springcore.module1.beans.Address;
import com.te.springcore.module1.beans.Student;

public class Config {
	@Bean(name = "student")
	public Student getStudentObj() {
		System.out.println("getstudentobj in config");
		Student student=new Student();
		student.setStudentId(01);
		student.setStudentName("abhinav");
		student.setStudentAge(22);
		return student;

	}
	@Bean
	public Address getAddressObj() {
		System.out.println("getaddressobj in config");
		Address address=new Address();
		address.setId(011);
		address.setCity("banglore");
		address.setState("KARNATAKA");
		return address;
	}

}
