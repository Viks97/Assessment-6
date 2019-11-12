package com.example.Assess6.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Albums {
	private String alname;
	private String genre;
	@DBRef
	private List<Tracks> Albumtracks;
	public Albums() {}
	public Albums(String alname, String genre, List<Tracks> Albumtracks) {
		this.alname = alname;
		this.genre = genre;
		this.Albumtracks = Albumtracks;
	}
	public String getAlname() {
		return alname;
	}
	public void setAlname(String alname) {
		this.alname = alname;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<Tracks> getAlbumtracks() {
		return Albumtracks;
	}
	public void setTracks(List<Tracks> Albumtracks) {
		this.Albumtracks = Albumtracks;
	}

}
