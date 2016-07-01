package com.rentalx.rental;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.rentalx.account.Customer;
import com.rentalx.vehicle.Car;

import lombok.Data;

@Data
@Entity
public class Rental {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Car car;
	@OneToOne
	private Customer customer;
	
}
