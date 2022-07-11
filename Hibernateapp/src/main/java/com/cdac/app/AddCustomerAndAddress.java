package com.cdac.app;

import java.util.List;

import com.cdac.dao.CutomerAddressDao;
import com.cdac.entity.Adress;
import com.cdac.entity.Customer;

public class AddCustomerAndAddress {
	public static void main(String[] args) {
		
		/*
		Customer C =new Customer();
		C.setName("akash");
		C.setEmail("akash@gmail.com");
		
		
		Adress addr=new Adress();
		addr.setCity("Mumbai");
		addr.setPincode(425502);
		addr.setState("Mahrashtra");
		
		C.setAdress(addr);
		
		*/
		//CutomerAddressDao	dao =new CutomerAddressDao();
		//dao.addCust(C);
		
		//dao.addAddr(addr);
//========================================================
		//CutomerAddressDao	dao =new CutomerAddressDao();
		/*
		Customer C1=dao.fetchCust(1);
		Adress addr1=dao.fetchAddr(1);
		
		C1.setAdress(addr1);
		dao.update( C1);
		*/
		
		//dao.addCust(C);
//=============================================		
/*
		CutomerAddressDao	dao =new CutomerAddressDao();
	List<Customer>list=dao.fetchByCustByEmail("gmail");
		for(Customer c:list)
		System.out.println(c.getId()+" "+c.getEmail()+" "+c.getName() );
*/
		
/*
=============================================		
		CutomerAddressDao	dao =new CutomerAddressDao();
	List<Customer> list=dao.fetchCustByCity("Mumbai");	
	for(Customer c :list)
		System.out.println(c.getName()+"====> "+c.getId());
	}
==================================================	
*/
	CutomerAddressDao	dao =new CutomerAddressDao();
	List<Adress>list=dao.fetchAddrByName("abhishek");
	for(Adress addr :list)
		System.out.println(addr.getCity()+"==>"+addr.getPincode()+"==>"+addr.getState());
	}	
	
	
}
