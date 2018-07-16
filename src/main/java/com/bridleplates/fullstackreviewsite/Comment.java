package com.bridleplates.fullstackreviewsite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private Long id;
	private String userName;

	@Lob
	private String contents;

	@ManyToOne
	Breed breed;

	protected Comment() {
	}

	public Comment(String userName, String contents, Breed breed) {
		this.userName = userName;
		this.contents = contents;
		this.breed = breed;
	}

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getContents() {
		return contents;
	}

	public Breed getBreed() {
		return breed;
	}

}