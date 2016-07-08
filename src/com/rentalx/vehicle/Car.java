package com.rentalx.vehicle;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer carYear;
	private String model;
	private String brand;
	
	public Car(int carYear, String model, String brand){
		this.carYear = carYear;
		this.model = model;
		this.brand = brand;
		this.carDocumentList = new ArrayList<>();
		this.maintenanceList = new ArrayList<>();
		this.trafficList = new ArrayList<>();
	}
	
	
	@OneToMany
	private List<Traffic> trafficList;
	@OneToMany
	private List<Maintenance> maintenanceList;
	@OneToMany
	private List<CarDocument> carDocumentList;
	
}
