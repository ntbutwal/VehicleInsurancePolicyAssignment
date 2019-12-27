package com.insurance.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurance.entities.CustomerEntity;
import com.insurance.entities.PolicyEntity;
import com.insurance.repositories.CustomerRepository;
import com.insurance.repositories.PolicyRepository;

public class InsertPolicyMain {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		PolicyRepository porep = (PolicyRepository) ctxt.getBean("policyRepository");

		CustomerRepository crep = (CustomerRepository) ctxt.getBean("customerRepository");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, 7);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date startdate = cal.getTime();

		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.YEAR, 2018);
		cal1.set(Calendar.MONTH, 7);
		cal1.set(Calendar.DAY_OF_MONTH, 1);
		Date expiredate = cal1.getTime();

		PolicyEntity pol = new PolicyEntity();
		pol.setActive(true);
		pol.setExpiryDate(expiredate);
		pol.setPolicyNo("A16748");
		pol.setStartDate(startdate);
		pol.setType("Auto");
		CustomerEntity ce = crep.findById(1l);
		pol.setCustomer(ce);
		
		porep.saveFromPolicyEntity(pol);

	}

}
