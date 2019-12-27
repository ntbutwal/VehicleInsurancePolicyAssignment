package com.insurance.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.entities.CoveredVehicleEntity;

@Repository
@Transactional
public class VehicleRepository {
	private EntityManager entityManager;

	public void saveVehicleData(CoveredVehicleEntity cve) {
		entityManager.merge(cve);

	}

	public CoveredVehicleEntity findbyVin(String vin) {

		String hql = "select c from CoveredVehicleEntity c where vin=:no";
		Query query = entityManager.createQuery(hql);
		query.setParameter("no", vin);
		CoveredVehicleEntity cve = (CoveredVehicleEntity) query.getSingleResult();
		return cve;

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
