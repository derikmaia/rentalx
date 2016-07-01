package com.rentalx.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.Customer;

@Repository
public class CustomerRepository {

	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init(){	
	}
	
	@Transactional
	public Customer create (Customer customer){
		em.persist(customer);
		return customer;
	}
	
	@Transactional
	public Customer update (Customer customer){
		em.merge(customer);
		return customer;
	}
	
	@Transactional
	public Customer delete (Customer customer){
		em.remove(customer);
		return customer;
	}
	
	public Customer findById(Long id){
		return em.find(Customer.class, id);
	}
	
}
