package com.cdac.component;

import org.springframework.stereotype.Component;

@Component
public class IciciBank implements Bank {

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("ICICI withdraw method is called");
		
	}

	public boolean isAccountPresent(int acno) {
		if(acno==1010)
			return true;
		return false;
	}

}
