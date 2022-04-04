package com.te.springcore.assignment.beans;

public class HumanBeing implements Creature {
	private String creatureName="human";
	private String creatureType="human being";

	@Override
	public String creatureName() {
		System.out.println("Hai my name is human");
		return creatureName;
	}

	@Override
	public String creatureType() {
		System.out.println("I am a type of human being");
		return creatureType;
	}

}
