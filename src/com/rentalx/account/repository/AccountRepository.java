package com.rentalx.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.Account;

@Repository
public class AccountRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init(){	
	}
	
	@Transactional
	public Account create (Account acc){
		em.persist(acc);
		return acc;
	}
	
	@Transactional
	public Account update (Account acc){
		em.merge(acc);
		return acc;
	}
	
	@Transactional
	public Account delete (Account acc){
		em.remove(acc);
		return acc;
	}
	
	public Account findById(Long id){
		return em.find(Account.class, id);
	}

}
