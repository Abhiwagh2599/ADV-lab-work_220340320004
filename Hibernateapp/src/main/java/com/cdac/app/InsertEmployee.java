package com.cdac.app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

import com.cdac.dao.EmployeeDAO;
import com.cdac.entity.Employee;

import antlr.collections.List;

public class InsertEmployee {
	public static void main(String[] args) {
	
	Employee emp=new Employee();
	emp.setEmpno(103);
	emp.setName("Akash");
	emp.setSalary(4000);
	emp.setDateOfJoining (LocalDate.of(2022,07,01));
	
	EmployeeDAO dao=new EmployeeDAO();
	
	//dao.add(emp);
//======================================
	/*
	// calling fecthall method to get all data
	java.util.List<Employee>list=dao.fetchAll();
	
	for(Employee emp2 :list)
		System.out.println(emp2. getEmpno()+"  "+emp2.getName());
		
	}
	*/
//=========================================
/*
//calling fetchallbynames method
	java.util.List<String> name= dao.fetchAllByNames();
	for(String name2 :name)
		System.out.println(name2+"===> names fetched from database");
*/
//================================================
/*	
 calling fetchallbysalary
	java.util.List<Employee> list3=dao.fetchAllBySalary(3000);
	
	for(Employee emp3 :list3)
		System.out.println(emp3.getName()+"===>"+emp3.getEmpno()+"===>"+emp3.getSalary()+"====>"+emp3.getDateOfJoining());
*/	
//===================================================
//calling fetchallNamesandsalary
	java.util.List<Object[]> all= dao.fetchAllEmpnoAndSalaries();
	for(Object[] obj :all)
		System.out.println( obj[0]+"===>"+obj[1]);
//========================================================	
	
	}
}
