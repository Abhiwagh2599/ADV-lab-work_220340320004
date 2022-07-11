package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.Atm;
import com.cdac.component.*;

public class AtmApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("my-spring-config.xml");
		Atm atm=(Atm )ctx.getBean("HdfcAtm");
	
		atm.withdraw(1010,5555);
	}

}
