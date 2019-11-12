package com.example.Assess6.repo;

import java.util.List;

import com.example.Assess6.model.Albums;
import com.example.Assess6.model.Artist;
import com.example.Assess6.model.Tracks;



public interface TrackRepo {
	Tracks create(Tracks tracks);
	List<Tracks> findAll();
	Albums create(Albums albums);
	List <Albums> findalb();
	Artist create(Artist artist);
	List <Artist> findart();
	Boolean deleteTracks(Tracks tracks);



}
