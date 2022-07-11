package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao {
//these generic methods can be used for adding and updating any types of objects
	public void save(Object obj ) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		em.merge(obj);
		//merge method internally creates insert as well as update query
		tx.commit();
		emf.close();
		
	}
//======================================================	
	
	public Object fetchByID(Class clazz,Object pk) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		
		Object obj=em.find(clazz,pk);
		
		emf.close();
		return obj;
	}
//======================================================	
	public void delete(Class clazz,Object pk) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		Object obj=em.find(clazz, pk);
		em.remove(obj);
		
		tx.commit();
		emf.close();
	}
	
	
}
