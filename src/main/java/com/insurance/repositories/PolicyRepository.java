package com.insurance.repositories;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.entities.CustomerEntity;
import com.insurance.entities.PolicyEntity;

@Repository
@Transactional
public class PolicyRepository {

	private EntityManager entityManager;

	public void saveFromPolicyEntity(PolicyEntity pe) {
		entityManager.merge(pe);
	}

	public PolicyEntity getByID(Long id) {
		return entityManager.find(PolicyEntity.class, id);
	}

	public List<PolicyEntity> findExpiredPolicies() {
		Query q = (Query) entityManager.createQuery("select p from PolicyEntity p where p.expiryDate < :today");
		q.setParameter("today", new Date());
		return q.getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
