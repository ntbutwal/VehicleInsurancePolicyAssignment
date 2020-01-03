package com.insurance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurance.repositories.DriversRepsoitory;

public class DeleteDriverMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriversRepsoitory driversRepsoitory = (DriversRepsoitory) context.getBean("driversRepsoitory");
		driversRepsoitory.findDriversByName("Manoj");

	}

}
