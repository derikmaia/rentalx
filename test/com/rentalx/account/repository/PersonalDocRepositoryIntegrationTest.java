package com.rentalx.account.repository;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rentalx.account.PersonalDocument;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:WebContent/WEB-INF/application-context.xml")
public class PersonalDocRepositoryIntegrationTest {
	
	@Autowired
	private PersonalDocumentRepository docRepository;
	
	@Test
	public void createPersonalDoc (){	
		
		PersonalDocument personalDoc = new PersonalDocument();
		
		personalDoc.setDocNumber("123");
		personalDoc.setExpirationDate(new Date());

		personalDoc = docRepository.create(personalDoc);
		
		System.out.println(personalDoc);
		
		PersonalDocument storedDoc = docRepository.findById(personalDoc.getId());
		
		System.out.println(storedDoc);
		
	}
	
}
