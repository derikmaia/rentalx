package com.rentalx.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.account.PersonalDocument;

@Repository
public class PersonalDocumentRepository {

	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init(){	
	}
	
	@Transactional
	public PersonalDocument create (PersonalDocument doc){
		em.persist(doc);
		return doc;
	}
	
	@Transactional
	public PersonalDocument update (PersonalDocument doc){
		em.merge(doc);
		return doc;
	}
	
	@Transactional
	public PersonalDocument delete (PersonalDocument doc){
		em.remove(doc);
		return doc;
	}
	
	public PersonalDocument findById(Long id){
		return em.find(PersonalDocument.class, id);
	}
	
}
