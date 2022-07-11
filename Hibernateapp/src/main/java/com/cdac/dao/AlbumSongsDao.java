package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Album;
import com.cdac.entity.Songs;

public class AlbumSongsDao extends GenericDao{
	
	public List<Songs> fetchSongsByArtist(String atist) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select s from Songs s where artist=:art ");
		q.setParameter("art",atist );
		List<Songs>list=q.getResultList();
		emf.close();
		return list;
		
	}
//============================================ 
	public List<Songs> fetchSongsByAlbumId(int albid ) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select s from Songs s join s.album sa where sa.id=:alb_id");
		q.setParameter("alb_id",albid );
		
		List<Songs>list=q.getResultList();
		emf.close();
		return list;
	
	}
//============================================ 
	
	public Album fetchAlbumByArtist(String name){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select a from Album a join a.song s where  s.artist=:nm");
		q.setParameter("nm", name);
		Album album=(Album) q.getSingleResult();
		emf.close();
		return album;
	}
	
	
	
}
