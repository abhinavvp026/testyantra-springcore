package com.te.springcore.assignment.config;

import org.springframework.context.annotation.Bean;
import com.te.springcore.assignment.beans.GoldFish;

public class configGoldFish {
	@Bean(name = "GoldFish")
	public GoldFish getGoldFishObj() {
		GoldFish goldFish = new GoldFish();
		goldFish.creatureName();
		goldFish.creatureType();
		return goldFish;
	}

}
