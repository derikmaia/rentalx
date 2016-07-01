package com.rentalx.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.Organization;

@Repository
public class OrganizationRepository {

	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init(){	
	}
	
	@Transactional
	public Organization create (Organization organization){
		em.persist(organization);
		return organization;
	}
	
	@Transactional
	public Organization update (Organization organization){
		em.merge(organization);
		return organization;
	}
	
	@Transactional
	public Organization delete (Organization organization){
		em.remove(organization);
		return organization;
	}
	
	public Organization findById(Long id){
		return em.find(Organization.class, id);
	}
	
}
