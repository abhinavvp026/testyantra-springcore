package com.te.springcore.assignment.beans;

public class GoldFish implements Creature {
	private String creatureName = "golden";
	private String creatureType = "gold fish";

	@Override
	public String toString() {
		return "GoldFish [creatureName=" + creatureName + ", creatureType=" + creatureType + "]";
	}

	@Override
	public String creatureName() {
		System.out.println("Hai my name is golden");
		return creatureName;
	}

	@Override
	public String creatureType() {
		System.out.println("I am a type of Gold Fish");
		return creatureType;
	}

}