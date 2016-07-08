package com.rentalx.account.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rentalx.account.ContactInfo;
import com.rentalx.account.Organization;
import com.rentalx.account.Supplier;
import com.rentalx.rental.Rental;
import com.rentalx.vehicle.Car;
import com.rentalx.vehicle.repository.CarRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:WebContent/WEB-INF/application-context.xml")
public class AccountRepositoryIntegrationTest {
	
	@Autowired
	OrganizationRepository orgRepository;
	
	@Autowired
	CarRepository carRepository;
	
	@Autowired
	SupplierRepository supRepository;
	
	@Test
	public void createAccount (){	
		
		Organization org = new Organization();
		org.setName("Derik Org");
		org.setContactInfo(new ContactInfo("Rua das Cove", "SJC"));
		
		Car car = new Car(2016, "F250", "Ferrari");
		
		car = carRepository.create(car);
		assertNotNull("O carro tem ID", car.getId());
		org.getCarList().add(car);
		
		Supplier supplier = new Supplier("Embraer", new ContactInfo("Faria Lima", "SJC"));
		supRepository.create(supplier);
		assertNotNull(supplier.getId());		
		org.getSupplierList().add(supplier);
		
		org.getRentalList().add(new Rental());
		
		orgRepository.create(org);
		
		assertNotNull(org.getId());
	}
	
}
