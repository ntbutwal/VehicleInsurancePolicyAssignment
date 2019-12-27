package com.insurance.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.entities.AddressEntity;

@Repository
@Transactional
public class AddressRepository {
	private EntityManager entityManager;

	public void saveAddressData(AddressEntity add) {
		entityManager.merge(add);

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
