package com.te.springcore.assignment.beans;

public class Lion implements Creature {
	private String creatureName="tommy";
	private String creatureType="lion";
	

	@Override
	public String toString() {
		return "Lion [creatureName=" + creatureName + ", creatureType=" + creatureType + "]";
	}

	@Override
	public String creatureName() {
		System.out.println("Hai my name is tommy");
		return creatureName;
	}

	@Override
	public String creatureType() {
		System.out.println("I am a type of Lion");
		return creatureType;
	}

}