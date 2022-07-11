package com.cdac.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("HdfcAtm")
public class HdfcAtm implements Atm {
	
	@Autowired
	private List<Bank> bank;
	
	public void withdraw(int acno,double amount) {
		System.out.println("Atm withdraw method called");
		
		Bank presentAcount=null;
		for(Bank currentbank :bank)
		{
			boolean isPresent=currentbank.isAccountPresent(acno);
			if(isPresent) {
				presentAcount=currentbank;
				break;
			}
		}	
		
		presentAcount.withdraw(123,acno,amount);
	}
	
}
