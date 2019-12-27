package com.insurance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurance.entities.AdditionalDriversEntity;
import com.insurance.entities.CoveredVehicleEntity;
import com.insurance.repositories.DriversRepsoitory;
import com.insurance.repositories.PolicyRepository;
import com.insurance.repositories.VehicleRepository;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		VehicleRepository vehrep= (VehicleRepository) context.getBean("vehicleRepository");
		CoveredVehicleEntity hrep=vehrep.findbyVin("657236478g2387462378gg");
		System.out.println(hrep.toString());
		
	}

}
