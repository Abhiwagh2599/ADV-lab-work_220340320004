package com.cdac.dao;

import java.time.LocalDate;
import java.util.List;

import javax.management.QueryExp;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Employee;

public class EmployeeDAO {
	
	public void add(Employee emp) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
	// creating EntityManagerFactory object by using above method
	EntityManager em=emf.createEntityManager();
	// creating EntityManager object by using above method
	
	EntityTransaction tx=em.getTransaction();
	//creating Transaction obj 
	//transaction obj is required only for DDL operations like insert update delete
	tx.begin();
	
	em.persist( emp);//persist method creates insert query automaticaly
	
	tx.commit();
	emf.close();
	
	}
	
//===============================================
//fetching all objects from table
	public List<Employee> fetchAll() {
	EntityManagerFactory emf  =Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
	
	javax.persistence.Query q  = em.createQuery("select e from Employee e");
	 
	List<Employee> list =q.getResultList();
	//result returns ojects from table of type Employees stored in List
	
	 emf.close();
	 return list;
	}
//=================================================
	
	public List<String> fetchAllByNames() {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
	EntityManager em	=emf.createEntityManager();
	
	Query q	=em.createQuery("select e.name from Employee e");
	List<String> list2=q.getResultList();
		
	emf.close();
	return list2;
	}
//====================================================
	
	public List<Employee> fetchAllBySalary(double salary) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
	EntityManager em=emf.createEntityManager();
	
	Query q	=em.createQuery("select e from Employee e where e.salary=:sal");
	q.setParameter("sal",salary );//setting dynamic parameter
	List<Employee> list3=q.getResultList();
	
	emf.close();
	return list3;
	
	}
//=====================================================
	public List<Object[]> fetchAllEmpnoAndSalaries() {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
	EntityManager em=emf.createEntityManager();
	
	Query q	=em.createQuery("select e.empno,e.salary from  Employee e ");
	List<Object[]>	list=q.getResultList();
	
	emf.close();
	return list;
	}
	
	
	
}
