package com.cdac.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.CarParts;
import com.cdac.component.CarPartsInventory;

public class CarPartsApp2 {

	public static void main(String[] args) {
		ApplicationContext tcx=new ClassPathXmlApplicationContext("my-spring-config.xml");
		CarPartsInventory inv=(CarPartsInventory)tcx.getBean("CPI2");
		
		CarParts carparts=new CarParts();
		carparts.setPartName("headlights");
		carparts.setPartNo(103);
		carparts.setCarModel("entiga");
		carparts.setPrice(2220);
		carparts.setQuantity(8);
		
		inv.addCarParts(carparts);
	
	}

}
