package com.insurance.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.entities.PolicyEntity;
import com.insurance.repositories.PolicyRepository;

public class PolicyService {
	@Autowired
	private PolicyRepository policyRepository;
	@Autowired
	private PolicyEntity entity;

	public void renewPolicy() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 6);
		Date date = cal.getTime();

		if (policyRepository.getByID(1l) != null) {
			if (entity.getExpiryDate()== new Date()) {
				entity.setStartDate(new Date());
				entity.setExpiryDate(date);

			}
		}

	}

}
