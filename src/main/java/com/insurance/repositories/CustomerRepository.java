package com.insurance.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.entities.AdditionalDriversEntity;
import com.insurance.entities.AddressEntity;
import com.insurance.entities.CoveredVehicleEntity;
import com.insurance.entities.CustomerEntity;
import com.insurance.entities.PolicyEntity;

@Repository
@Transactional
public class CustomerRepository {

	private EntityManager entityManager;

	public void saveCustomerEntity(CustomerEntity ce) {

		entityManager.persist(ce);

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
