package com.insurance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurance.entities.AdditionalDriversEntity;
import com.insurance.repositories.DriversRepsoitory;

public class UpdateDriverMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriversRepsoitory driversRepsoitory = (DriversRepsoitory) context.getBean("driversRepsoitory");
		AdditionalDriversEntity add = driversRepsoitory.findDriversByName1("Manoj");
		add.setActive(false);
		add.setIssuedState("VA");
		add.setLicenseNo("abcd1234");
		add.setName("Jindagi Rocks");
		driversRepsoitory.findDriversByName1("Manoj");
		driversRepsoitory.saveDriverEntity(add);

	}

}
