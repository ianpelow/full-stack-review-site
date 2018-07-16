package com.bridleplates.fullstackreviewsite;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String imgUrl;
	private String imgUrl2;
	private String imgUrl3;
	
	@Lob
	private String description;
	
	@ManyToMany
	private Collection<Breed> breeds;
	
	
	public Tag () {}
	
	public Tag(String name) {
		this.name = name;		
	}

	public Tag(String name, String imgUrl, String imgUrl2, String imgUrl3, String description, Breed... breeds
			) {
		this.name = name;
		this.imgUrl = imgUrl;
		this.imgUrl2 = imgUrl2;
		this.imgUrl3 = imgUrl3;
		this.description = description;
		this.breeds = Arrays.asList(breeds);
		
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


	public String getDescription() {
		return description;
	}


	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Breed> getBreeds() {
		return breeds;
	}

	@Override
	public String toString() {
		return name;
	}

}