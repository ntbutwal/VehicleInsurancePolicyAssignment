package com.insurance.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	public AdditionalDriversEntity findDriversByName(String dname) {
		Query query = entityManager.createQuery("delete from AdditionalDriversEntity where name=:name");
		query.setParameter("name", dname);
		AdditionalDriversEntity ade = (AdditionalDriversEntity) query.getSingleResult();
		return ade;

	}

	public AdditionalDriversEntity findDriversByName1(String dname) {
		Query query = entityManager.createQuery("update from AdditionalDriversEntity where name=:name");
		query.setParameter("name", dname);
		AdditionalDriversEntity ade = (AdditionalDriversEntity) query.getSingleResult();
		return ade;

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
