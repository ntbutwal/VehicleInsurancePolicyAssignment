package com.insurance.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurance.entities.AdditionalDriversEntity;
import com.insurance.entities.AddressEntity;
import com.insurance.entities.CoveredVehicleEntity;
import com.insurance.entities.CustomerEntity;
import com.insurance.entities.PolicyEntity;
import com.insurance.repositories.CustomerRepository;

public class InsertCustomerEntityMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		CustomerRepository rep = (CustomerRepository) context.getBean("customerRepository");
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR, 2019);
//		cal.set(Calendar.MONTH, 7);
//		cal.set(Calendar.DAY_OF_MONTH, 1);
//		Date startdate = cal.getTime();
//
//		Calendar cal1 = Calendar.getInstance();
//		cal1.set(Calendar.YEAR, 2019);
//		cal1.set(Calendar.MONTH, 7);
//		cal1.set(Calendar.DAY_OF_MONTH, 1);
//		Date expiredate = cal1.getTime();

		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 1998);
		cal2.set(Calendar.MONTH, 4);
		cal2.set(Calendar.DAY_OF_MONTH, 1);
		Date dob = cal2.getTime();

//		PolicyEntity pe = new PolicyEntity();
//		pe.setActive(true);
//		pe.setStartDate(startdate);
//		pe.setExpiryDate(expiredate);
//		pe.setPolicyNo("A20170808");
//		pe.setType("Auto Policy");
		

		CustomerEntity cus = new CustomerEntity();
		cus.setDob(dob);
		cus.setEmail("ntbutwal@gmail.com");
		cus.setGender("Male");
		cus.setLicenseNo("VA37489893");
		cus.setName("Kishor Kunwar");
		cus.setPhone("7032203541");
		cus.setSsn("1111");
		rep.saveCustomerEntity(cus);
		

//		AddressEntity add = new AddressEntity();
//		add.setCity("Chintilly");
//		add.setLine1("3025 Virginia Dare Ct");
//		add.setState("Virginia");
//		add.setZip("20151");
//		add.setCustomer(cus);

//		AdditionalDriversEntity ade = new AdditionalDriversEntity();
//		ade.setActive(true);
//		ade.setIssuedState("Virginia");
//		ade.setLicenseNo("VA637822");
//		ade.setName("Jay Joshi");

//		CoveredVehicleEntity veh = new CoveredVehicleEntity();
//		veh.setIsActive(true);
//		veh.setMake("Toyota");
//		veh.setModel("Camry");
//		veh.setVin("648924769238479");
//		veh.setYear("2017");
//		
//		
//		pe.setCustomerEntity(cus);
//		veh.setPolicyEntity(pe);
//		ade.setPolicyEntity(pe);
//		
//		rep.saveAllEntities(veh,add,ade);
		
		
		
		
		
		
		
		
		
		
		
	}

}
