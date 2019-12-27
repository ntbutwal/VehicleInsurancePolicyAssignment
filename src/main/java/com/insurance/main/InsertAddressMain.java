package com.insurance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurance.entities.AddressEntity;
import com.insurance.repositories.AddressRepository;
import com.insurance.repositories.CustomerRepository;

public class InsertAddressMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddressRepository addrep = (AddressRepository) context.getBean("addressRepository");
		CustomerRepository cusrep = (CustomerRepository) context.getBean("customerRepository");
		AddressEntity add = new AddressEntity();
		add.setCity("Chgantilly");
		add.setLine1("3025 Virginia Dare Ct");
		add.setState("Virginia");
		add.setZip("20151");
		add.setCustomeradd(cusrep.findById(1l));
		addrep.saveAddressData(add);

	}
}
