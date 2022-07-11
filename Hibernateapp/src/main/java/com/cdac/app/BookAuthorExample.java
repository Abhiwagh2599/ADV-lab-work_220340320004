package com.cdac.app;

import java.util.ArrayList;
import java.util.List;

import com.cdac.dao.GenericDao;
import com.cdac.entity.Author;
import com.cdac.entity.Book;

public class BookAuthorExample {
	public static void main(String[] args) {
		GenericDao dao=new GenericDao();
		
		Book book1=new Book();
		book1.setName("English");
		book1.setCost(500);
		
		Author author1=new Author();
		author1.setName("shakespear");
		author1.setEmail("shake@gmail");
		
		Author author2=new Author();
		author2.setName("shakespear");
		author2.setEmail("shake@gmail");
		
		List<Author>list=new ArrayList<Author>();
		list.add(author1);
		list.add(author2);
		book1.setAuthor(list);
		
		dao.save( book1);
	}
	
}
