package com.rentalx.vehicle.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.vehicle.Car;

@Repository
public class CarRepository {
	
		@PersistenceContext
		private EntityManager em;
		
		@PostConstruct
		public void init(){	
		}
		
		@Transactional
		public Car create (Car car){
			em.persist(car);
			return car;
		}
		
		@Transactional
		public Car update (Car car){
			em.merge(car);
			return car;
		}
		
		@Transactional
		public Car delete (Car car){
			em.remove(car);
			return car;
		}
		
		public Car findById(Long id){
			return em.find(Car.class, id);
		}

}
