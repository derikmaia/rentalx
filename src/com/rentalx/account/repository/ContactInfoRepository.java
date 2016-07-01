package com.rentalx.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.ContactInfo;

@Repository
public class ContactInfoRepository {

	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init(){	
	}
	
	@Transactional
	public ContactInfo create (ContactInfo contact){
		em.persist(contact);
		return contact;
	}
	
	@Transactional
	public ContactInfo update (ContactInfo contact){
		em.merge(contact);
		return contact;
	}
	
	@Transactional
	public ContactInfo delete (ContactInfo contact){
		em.remove(contact);
		return contact;
	}
	
	public ContactInfo findById(Long id){
		return em.find(ContactInfo.class, id);
	}
}
