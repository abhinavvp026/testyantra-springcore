package com.te.springcore.assignment.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Earth implements Serializable {
	private Double planetRadius;
	private Double waterOnPlanetPercentage;

	@Autowired
	@Qualifier("GoldFish")
	private Creature creature;

	public Earth() {
		super();
	}

	public Earth(Double planetRadius, Double waterOnPlanetPercentage, Creature creature) {
		super();
		this.planetRadius = planetRadius;
		this.waterOnPlanetPercentage = waterOnPlanetPercentage;
		this.creature = creature;
	}

	public Double getPlanetRadius() {
		return planetRadius;
	}

	public void setPlanetRadius(Double planetRadius) {
		this.planetRadius = planetRadius;
	}

	public Double getWaterOnPlanetPercentage() {
		return waterOnPlanetPercentage;
	}

	public void setWaterOnPlanetPercentage(Double waterOnPlanetPercentage) {
		this.waterOnPlanetPercentage = waterOnPlanetPercentage;
	}

	public Creature getCreature() {
		return creature;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}

	@Override
	public String toString() {
		return "Earth [planetRadius=" + planetRadius + ", waterOnPlanetPercentage=" + waterOnPlanetPercentage
				+ ", creature=" + creature + "]";
	}

}
