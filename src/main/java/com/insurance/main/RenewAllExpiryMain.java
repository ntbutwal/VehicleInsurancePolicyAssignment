package com.insurance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurance.services.PolicyService;

public class RenewAllExpiryMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PolicyService service = (PolicyService) context.getBean("policyService");
		service.renewPolicy();

	}

}
