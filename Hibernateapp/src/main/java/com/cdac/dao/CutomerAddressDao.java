package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.cdac.entity.Adress;
import com.cdac.entity.Customer;


public class CutomerAddressDao {
	
	
	public void addCust(Customer C) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx =em.getTransaction();
		tx.begin();
		em.persist(C);
		
		tx.commit();
		
		emf.close();
	}
	
	public void addAddr(Adress addr) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx =em.getTransaction();
		tx.begin();
		em.persist(addr);
		
		tx.commit();
		
		emf.close();
	}
	
	public Customer fetchCust(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		
		Customer C	=em.find(Customer.class, id);
		
		emf.close();
		return C;
	}
	

	public Adress fetchAddr(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		
		Adress addr	=em.find(Adress.class, id);
		
		emf.close();
		return addr;
	}
	public void update(Customer C ) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx =em.getTransaction();
		tx.begin();
		
		em.merge(C);
		tx.commit();
		emf.close();
	}
	
	public List<Customer> fetchByCustByEmail(String domain){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select c from Customer c where c.email like:em");
		q.setParameter("em","%"+domain+"%" );
		
		List<Customer> list=q.getResultList();
		emf.close();
		return list;
		
	}
//========================================
//fetching city on basis of joins
	
	public List<Customer> fetchCustByCity(String city) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select c from  Customer c join c.adress a where a.city=:ct ");
		//joining two tables using joins =====no need of on clause for joins in HQL
		
		q.setParameter("ct",city);
		List<Customer> list=q.getResultList();
		emf.close();
		
		return list;
	}
//======================================
//fetching customer address	
	public List<Adress> fetchAddrByName(String name) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select a from  Customer c join c.adress a where c.name=:nm");
		q.setParameter("nm", name);
	
		List<Adress> list=q.getResultList();
		emf.close();
		return list;
	}
}
