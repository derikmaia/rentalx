package com.rentalx.vehicle;
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

	@OneToMany
	private List<Traffic> trafficList;
	@OneToMany
	private List<Maintenance> maintenanceList;
	@OneToMany
	private List<CarDocument> carDocumentList;
	
}
