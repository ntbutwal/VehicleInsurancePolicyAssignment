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
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerRepository rep = (CustomerRepository) context.getBean("customerRepository");

		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 194);
		cal2.set(Calendar.MONTH, 4);
		cal2.set(Calendar.DAY_OF_MONTH, 12);
		Date dob = cal2.getTime();

		CustomerEntity cus = new CustomerEntity();
		cus.setDob(dob);
		cus.setEmail("Jay.joshi@gmail.com");
		cus.setGender("Male");
		cus.setLicenseNo("VA37478373");
		cus.setName("Jay Joshi");
		cus.setPhone("2042203541");
		cus.setSsn("3333");
		rep.saveCustomerEntity(cus);

	}

}
