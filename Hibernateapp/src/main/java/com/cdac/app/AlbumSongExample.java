package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.AlbumSongsDao;
import com.cdac.dao.GenericDao;
import com.cdac.entity.Album;
import com.cdac.entity.Songs;

import antlr.collections.List;

public class AlbumSongExample{
	public static void main(String[] args) {
		GenericDao genericdao=new GenericDao();
		
		/*
		//album 1
		Album album=new Album();
		album.setName("Hits of 2020");
		album.setReleasedate(LocalDate.of(2020, 12, 30));
		album.setCopyright("Amazon Music");
		genericdao.save(album);
		*/
/*
//============================================		
//first song corresponding to album no 1
		Album album=(Album)genericdao.fetchByID(Album.class,1);
		Songs song=new Songs();
		song.setTitle("stu");
		song.setArtist("Ed Sheeran");
		song.setDuration(3.15);
		
		song.setAlbum(album);
		
		genericdao.save(song);
//============================================
*/
/*
//============================================
//second song for album 1
		Album album=(Album)genericdao.fetchByID(Album.class,1);
		Songs song=new Songs();
		song.setTitle("pardesi");
		song.setArtist("udit");
		song.setDuration(4);
		
		song.setAlbum(album);
		
		genericdao.save(song);
//============================================
*/
//third song for album 1
//============================================
/*	
//============================================ 
		Album album=(Album)genericdao.fetchByID(Album.class,1);		
		Songs song=new Songs();
		song.setTitle("hamraj");
		song.setArtist("sonu nigam");
		song.setDuration(4);
		
		song.setAlbum(album);
		
		genericdao.save(song);
//============================================		
*/
/*
 //============================================
 second album
		Album album=new Album();
		album.setName("Hits of 2021");
		album.setReleasedate(LocalDate.of(2021, 10, 15));
		album.setCopyright("Sony Music");
		genericdao.save(album);	
//============================================
*/
		
//first song for second album
//============================================
/*
		Album album=(Album)genericdao.fetchByID(Album.class,2);		
		Songs song=new Songs();
		song.setTitle("jane jigar");
		song.setArtist("kumar sanu");
		song.setDuration(4);
		
		song.setAlbum(album);
		
		genericdao.save(song);
//============================================
*/		
//second song for second album
//============================================
/*		
		Album album=(Album)genericdao.fetchByID(Album.class,2);		
		Songs song=new Songs();
		song.setTitle("khalibali");
		song.setArtist("Arijit");
		song.setDuration(4);
		
		song.setAlbum(album);
		
		genericdao.save(song);
//============================================
*/
/*
//============================================ 
 
		AlbumSongsDao dao=new AlbumSongsDao();
		java.util.List<Songs> list=dao.fetchSongsByArtist("udit");
		for(Songs sl:list)
			System.out.println(sl.getArtist()+" "+sl.getTitle()+" "+sl.getDuration());
//============================================ 
*/
//============================================ 
/*		
		AlbumSongsDao dao=new AlbumSongsDao();
		java.util.List<Songs>list=dao.fetchSongsByAlbumId(1);
		for(Songs sl:list)
			System.out.println(sl.getArtist()+" "+sl.getTitle()+" "+sl.getDuration());
//============================================ 
*/	
		AlbumSongsDao dao=new AlbumSongsDao();
		Album album=dao.fetchAlbumByArtist("udit");
		System.out.println(album.getName());
		
	}
	
}
