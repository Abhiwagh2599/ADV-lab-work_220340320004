package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Person;

public class PersonPassportDao {

	public void add(Person person){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(person);
		tx.commit();
		emf.close();
	}
//======================================
	public Person fetchByPassportNO(int passportno) {
		
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
			EntityManager em=emf.createEntityManager();
			
			Query q=em.createQuery("select p from Person p join p.passport ps where ps.passportno =:pno");
			q.setParameter("pno", passportno);
			Person obj=(Person) q.getSingleResult();
			emf.close();
			return obj;
	}
//============================================
	
	public List<Person> PassportByExpiryYear(int year) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select p from Person p join p.passport ps where year(ps.expiryDate)=:yr");
		q.setParameter("yr", year);
		List<Person> list=q.getResultList();
		emf.close();
		return list;
	}
	
	
	
}
