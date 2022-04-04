package com.te.springcore.assignment.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.te.springcore.assignment.beans.Earth;
@Import({configGoldFish.class, configLion.class, configPeacock.class ,ConfigHumaBeing.class})
public class Config {
	@Bean(name = "earth")
	public Earth getEarthObj() {
		Earth earth = new Earth();
		earth.setWaterOnPlanetPercentage(2165465451d);
		earth.setPlanetRadius(6546545154d);
		return earth;
	}

}
