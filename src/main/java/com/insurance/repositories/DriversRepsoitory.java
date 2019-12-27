package com.insurance.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.entities.AdditionalDriversEntity;

@Repository
@Transactional
public class DriversRepsoitory {

	private EntityManager entityManager;

	public void saveDriverEntity(AdditionalDriversEntity driver) {
		entityManager.merge(driver);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
