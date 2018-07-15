package com.bridleplates.fullstackreviewsite;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This is what we need to figure out

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	TagRepository tagRepo;

	@RequestMapping("/tags") // /api/tags
	public Collection<Tag> getTags() {
		return (Collection<Tag>) tagRepo.findAll();
	}

	@RequestMapping("/tags/{id}")
	public Tag getTag(@PathVariable(name = "id") Long id) {
		return tagRepo.findOne(id);
	}
}