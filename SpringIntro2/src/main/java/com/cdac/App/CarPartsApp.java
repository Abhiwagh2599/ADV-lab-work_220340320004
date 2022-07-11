package com.cdac.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.CarParts;
import com.cdac.component.CarPartsInventory;

public class CarPartsApp {
	public static void main(String[] args) {
		System.out.println("execution started");
		ApplicationContext tcx=new ClassPathXmlApplicationContext("my-spring-config.xml");
		CarPartsInventory inv=(CarPartsInventory )tcx.getBean("CPI1");
		
		
		CarParts carparts=new CarParts();
		carparts.setPartNo(102);
		carparts.setPartName("Seat Cover");
		carparts.setCarModel("tata tiago");
		carparts.setPrice(2200);
		carparts.setQuantity(2);
		
		inv.addCarParts(carparts );
		System.out.println("execution ended");
		
	}
}
