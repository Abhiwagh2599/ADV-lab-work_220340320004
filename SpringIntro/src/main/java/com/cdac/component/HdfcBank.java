package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("HdfcBank")
public class HdfcBank implements Bank{
	public void withdraw(int atmId,int acno,double amount){
		System.out.println("hdfc bank withdraw method is callled");
		
	}

	public boolean isAccountPresent(int acno) {
		if(acno==2020)
			return true;
		return false;
	}
}
