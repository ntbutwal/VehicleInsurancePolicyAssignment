package com.insurance.services;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.entities.PolicyEntity;
import com.insurance.repositories.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	public void renewPolicy() {
		List<PolicyEntity> policiesTobeRenewed = policyRepository.findExpiredPolicies();
		for (PolicyEntity p : policiesTobeRenewed) {

			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.MONTH, 6);
			Date date = cal.getTime();

			p.setStartDate(new Date());
			p.setExpiryDate(date);
			
			policyRepository.saveFromPolicyEntity(p);
		}

	}

}
