package com.te.springcore.assignment.beans;

public class Peacock implements Creature {
	private String creatureName = "peasoosa";
	private String creatureType = "peacock";

	@Override
	public String toString() {
		return "Peacock [creatureName=" + creatureName + ", creatureType=" + creatureType + "]";
	}

	@Override
	public String creatureName() {
		System.out.println("Hai my name is peasoosa");
		return creatureName;
	}

	@Override
	public String creatureType() {
		System.out.println("I am a type of peacock");
		return creatureType;
	}

}