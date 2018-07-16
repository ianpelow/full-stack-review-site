package com.bridleplates.fullstackreviewsite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Discipline {

	@ManyToOne
	private Breed breed;

	@ManyToOne
	private Discipline discipline;

	@Id
	@GeneratedValue
	private Long id;

	private String title;
	private String imgUrl;
	private String imgUrl2;
	private String imgUrl3;
	
	@Lob
	private String description;

	public Discipline() {

	}

	public Discipline(String title, String description, String imgUrl, String imgUrl2, String imgUrl3, Breed breed) {
		this.title = title;
		this.description = description;
		this.imgUrl = imgUrl;
		this.imgUrl2 = imgUrl2;
		this.imgUrl3 = imgUrl3;
		this.breed = breed;

	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getImgUrl2() {
		return imgUrl2;
	}

	public String getImgUrl3() {
		return imgUrl3;
	}

	@Override
	public String toString() {
		return "Discipline [breed=" + breed + ", id=" + id + ", title=" + title + ", imgUrl=" + imgUrl + ", imgUrl2="
				+ imgUrl2 + ", imgUrl3=" + imgUrl3 + ", description=" + description + "]";
	}

}
