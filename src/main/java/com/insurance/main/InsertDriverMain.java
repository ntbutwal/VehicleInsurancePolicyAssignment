package com.insurance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurance.entities.AdditionalDriversEntity;
import com.insurance.repositories.DriversRepsoitory;
import com.insurance.repositories.PolicyRepository;

public class InsertDriverMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriversRepsoitory driverrep = (DriversRepsoitory) context.getBean("driversRepsoitory");
		PolicyRepository porep = (PolicyRepository) context.getBean("policyRepository");
		AdditionalDriversEntity driver = new AdditionalDriversEntity();
		driver.setActive(true);
		driver.setIssuedState("Virginia");
		driver.setLicenseNo("A12347658");
		driver.setName("Manoj");
		driver.setPolicy(porep.getByID(1l));
		driverrep.saveDriverEntity(driver);

		driver.setActive(true);
		driver.setIssuedState("Virginia");
		driver.setLicenseNo("A12345hsh");
		driver.setName("Roshan Ramtel");
		driver.setPolicy(porep.getByID(1l));
		driverrep.saveDriverEntity(driver);

	}

}
