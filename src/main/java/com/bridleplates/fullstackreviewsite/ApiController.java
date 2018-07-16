package com.bridleplates.fullstackreviewsite;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	BreedRepository breedRepo;
	
	@RequestMapping("/breeds")
	public Collection<Breed> getBreeds() {
		return (Collection<Breed>) breedRepo.findAll();
	}
	
	@RequestMapping("/breeds/{id}")
	public Breed getBreed(@PathVariable(name = "id") Long id) {
		return breedRepo.findOne(id);
	}
}