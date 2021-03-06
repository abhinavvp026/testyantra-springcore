package com.te.springcore.module1.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private int Id;
	private String city;
	private String state;

	public Address() {
		super();
		System.out.println("address default constructor");
	}

	public Address(int id, String city, String state) {
		super();
		Id = id;
		this.city = city;
		this.state = state;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
		System.out.println("address setid");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("address set city");
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("address set state");
	}

	@Override
	public String toString() {
		return "Address [Id=" + Id + ", city=" + city + ", state=" + state + "]";
	}

}
