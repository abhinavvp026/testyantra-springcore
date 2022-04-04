package com.te.springcore.assignment.config;

import org.springframework.context.annotation.Bean;
import com.te.springcore.assignment.beans.Peacock;

public class configPeacock {
	@Bean
	public Peacock getPeacockObj() {
		Peacock peacock = new Peacock();
		peacock.creatureName();
		peacock.creatureType();
		return peacock;
	}

}
