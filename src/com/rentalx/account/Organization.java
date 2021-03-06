package com.rentalx.account;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.rentalx.rental.Rental;
import com.rentalx.vehicle.Car;

import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Organization extends Account {
	
	@OneToMany
	private List<Rental> rentalList;
	
	@OneToMany
	private List<Car> carList;
	
	@OneToMany
	private List<Supplier> supplierList; 
	
	public Organization(){
		this.carList = new ArrayList<Car>();
		this.rentalList = new ArrayList<Rental>();
		this.supplierList = new ArrayList<Supplier>();
	}
	
}
