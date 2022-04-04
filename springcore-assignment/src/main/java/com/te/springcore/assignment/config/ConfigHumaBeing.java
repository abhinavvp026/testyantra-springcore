package com.te.springcore.assignment.config;

import org.springframework.context.annotation.Bean;

import com.te.springcore.assignment.beans.HumanBeing;

public class ConfigHumaBeing {
	@Bean
	public HumanBeing getHumanObject() {
		HumanBeing being = new HumanBeing();
		being.creatureName();
		being.creatureType();
		return being;
	}

}
