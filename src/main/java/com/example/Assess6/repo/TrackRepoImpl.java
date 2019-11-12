package com.example.Assess6.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.Assess6.model.Albums;
import com.example.Assess6.model.Artist;
import com.example.Assess6.model.Tracks;



@Repository
public class TrackRepoImpl implements TrackRepo {
	@Autowired
	private MongoTemplate mongo;
	
	public Tracks create(Tracks tracks) {
		return mongo.save(tracks);
	}

	public List<Tracks> findAll() {
		return mongo.findAll(Tracks.class);
	}
	
	public Albums create(Albums albums) {
		return mongo.save(albums);
	}

	public Artist create(Artist artist) {
		return mongo.save(artist);
	}

	@Override
	public List<Albums> findalb() {
		// TODO Auto-generated method stub
		return mongo.findAll(Albums.class);
	}

	@Override
	public List<Artist> findart() {
		// TODO Auto-generated method stub
		return mongo.findAll(Artist.class);
	}
	

}
