package com.insurance.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurance.entities.PolicyEntity;
import com.insurance.repositories.PolicyRepository;

public class FindPolicyMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PolicyRepository porep = (PolicyRepository) context.getBean("policyRepository");
		PolicyEntity pe=porep.getByID(1l);
		System.out.println(pe.toString());

	}

}
