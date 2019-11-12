package com.example.Assess6.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;


public class Artist {
	private String name;
	private int id;
	@DBRef
	private List<Albums> ArtistAlbums;
	@DBRef
	private List<Tracks> ArtistTracks;
	public Artist() {}
	public Artist(String name, int id, List<Albums> artistAlbums, List<Tracks> artistTracks) {
		super();
		this.name = name;
		this.id = id;
		ArtistAlbums = artistAlbums;
		ArtistTracks = artistTracks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Albums> getArtistAlbums() {
		return ArtistAlbums;
	}
	public void setArtistAlbums(List<Albums> artistAlbums) {
		ArtistAlbums = artistAlbums;
	}
	public List<Tracks> getArtistTracks() {
		return ArtistTracks;
	}
	public void setArtistTracks(List<Tracks> artistTracks) {
		ArtistTracks = artistTracks;
	}
	
}
