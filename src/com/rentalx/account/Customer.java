package com.rentalx.account;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Customer extends Account {

	@OneToMany
	private List<PersonalDocument> documents;
	
	public Customer(){
		super();
		documents = new ArrayList<PersonalDocument>();
	}

}
