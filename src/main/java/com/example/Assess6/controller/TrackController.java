package com.example.Assess6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assess6.model.Albums;
import com.example.Assess6.model.Artist;
import com.example.Assess6.model.Tracks;
import com.example.Assess6.repo.TrackRepo;


@RestController
public class TrackController {
	@Autowired
	private TrackRepo repo;
	
	@PostMapping("/tracks")
	public Tracks create(@RequestBody Tracks tracks) {
		return repo.create(tracks);
	}
	
	@GetMapping("/tracks")
	public List<Tracks> create() {
		return repo.findAll();
	}
	@PostMapping("/artists")
	public Artist create1(@RequestBody Artist artist) {
		return repo.create(artist);
	}
	
	@PostMapping("/albums")
	public Albums create2(@RequestBody Albums albums) {
		return repo.create(albums);
	}
	@GetMapping("/artists")
	public List<Artist> create1() {
		return repo.findart();
	}
	@GetMapping("/albums")
	public List<Albums> create2() {
		return repo.findalb();
	}

	

}
