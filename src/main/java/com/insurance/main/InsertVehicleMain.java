package com.insurance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurance.entities.CoveredVehicleEntity;
import com.insurance.repositories.PolicyRepository;
import com.insurance.repositories.VehicleRepository;

public class InsertVehicleMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		VehicleRepository vehrep = (VehicleRepository) context.getBean("vehicleRepository");
		PolicyRepository porep = (PolicyRepository) context.getBean("policyRepository");
		CoveredVehicleEntity cve = new CoveredVehicleEntity();

		cve.setIsActive(true);
		cve.setMake("Toyota");
		cve.setModel("Camry");
		cve.setVin("657236478g2387462378gg");
		cve.setYear("2017");
		cve.setPolicyVeh(porep.getByID(1l));
		vehrep.saveVehicleData(cve);
	}

}
