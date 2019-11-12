package com.example.Assess6.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="tracks")
public class Tracks {
	@Id
	private String id;
	private String title;
	private String duration;
	public Tracks() {}
	public Tracks(String id, String title, String duration) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}
