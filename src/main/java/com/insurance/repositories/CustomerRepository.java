package com.insurance.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.entities.CustomerEntity;


@Repository
@Transactional
public class CustomerRepository {

	private EntityManager entityManager;

	public void saveCustomerEntity(CustomerEntity ce) {

		entityManager.persist(ce);

	}

	public CustomerEntity findById(Long id) {
		return entityManager.find(CustomerEntity.class, id);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
