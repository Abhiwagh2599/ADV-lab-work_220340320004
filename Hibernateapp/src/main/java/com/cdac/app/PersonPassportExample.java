package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cdac.dao.PersonPassportDao;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;

public class PersonPassportExample {
	public static void main(String[] args) {
/*
		Person person=new Person();
		person.setName("Pritesh");
		person.setEmail("pritesh@gmail");
		person.setDateOfBirth( LocalDate.of(1997,03,15));
		
		Passport passport=new Passport();
		passport.setIssueDate(LocalDate.of(2021,03,22));
		passport.setExpiryDate(LocalDate.of(2026,06,11));
		passport.setIssuedBy("Govt.of India");
		
		person.setPassport(passport);
		passport.setPerson(person);
		
		PersonPassportDao dao=new PersonPassportDao();
		dao.add(person);
*/
//==================================================		
/*
		PersonPassportDao dao=new PersonPassportDao();
		Person person=dao.fetchByPassportNO(2);
		System.out.println(person.getName()+" "+person.getDateOfBirth() );
*/
//==============================================	
		PersonPassportDao dao=new PersonPassportDao();
		List<Person> list=dao.PassportByExpiryYear(2026);
		for(Person person :list)
			System.out.println(person.getName()+" "+person.getDateOfBirth());
		
			
	}
	
	
}
