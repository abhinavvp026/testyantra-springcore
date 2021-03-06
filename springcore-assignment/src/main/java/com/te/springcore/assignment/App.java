package com.te.springcore.assignment;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcore.assignment.beans.Earth;
import com.te.springcore.assignment.config.Config;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Earth earth = (Earth) applicationContext.getBean("earth");
		System.out.println("->" + earth);
	}
}
