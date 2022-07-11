package com.cdac.component;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Component("CPI2")
public class CarPartsInventoryImpl2 implements CarPartsInventory{
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void addCarParts(CarParts cp) {
		em.persist(cp);
		
	}

	public List<CarParts> getCarParts() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
