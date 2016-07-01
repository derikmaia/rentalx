package com.rentalx.account;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

import lombok.Data;


@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ContactInfo contactInfo;
	
	public Account(){
		
	}

	public Account(String name, ContactInfo contactInfo) {
		super();
		this.name = name;
		this.contactInfo = contactInfo;
	}
}
