package com.insurance.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.entities.AdditionalDriversEntity;
import com.insurance.entities.AddressEntity;
import com.insurance.entities.CoveredVehicleEntity;
import com.insurance.entities.PolicyEntity;

@Repository
@Transactional
public class SaveAllEntityRepository {

	private EntityManager entityManager;

	public void saveAllEntities(CoveredVehicleEntity ce) {

		entityManager.persist(ce);

	}
	public void saveAllEntities1(AdditionalDriversEntity ade) {

		entityManager.persist(ade);

	}
	public void saveAllEntities2(AddressEntity add) {

		entityManager.persist(add);

	}
	public void saveAllEntities3(PolicyEntity pol) {

		entityManager.persist(pol);

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
