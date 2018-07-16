package com.bridleplates.fullstackreviewsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommentController {

	@Autowired
	CommentRepository commentRepo;

	@Autowired
	BreedRepository breedRepo;

	@RequestMapping(value = "/breed/{id}", method = RequestMethod.POST)
	public String addComment(@PathVariable(name = "id") String commentText) {
		return "redirect:/breeds/{id}";

	}
	
	@RequestMapping(value = "/remove-comment", method = RequestMethod.POST)
	public String removeComment(String deleteComment) {
		commentRepo.delete(commentRepo.findByComment(deleteComment));
		return "redirect:/breed";
	}

}