package com.bridleplates.fullstackreviewsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BreedSiteController {

	@Autowired
	BreedRepository breedRepo;
	
	@Autowired
	DisciplineRepository disciplineRepo;
	
	@RequestMapping("/breeds")
	public String getBreeds( Model model) {
		model.addAttribute("breeds", breedRepo.findAll());
		return "breeds";
		
	}
		
	@RequestMapping("/breeds/{id}")
	public String getBreed(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("breed", breedRepo.findOne(id));
		return "breed";
		
	}
	
	@RequestMapping("/disciplines")
	public String getDisciplines(Model model) {
		model.addAttribute("disciplines", disciplineRepo.findAll());
		return "disciplines";
	}
	
	@RequestMapping("/disciplines/{id}")
	public String getDiscipline(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("discipline", disciplineRepo.findOne(id));
		return "discipline";
		
	}

}


