package com.johntran.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.johntran.relationships.models.Person;
import com.johntran.relationships.services.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	PersonService personRepo;
	
	@GetMapping("/persons/new")
	public String addPersonPage(
			@ModelAttribute("person") Person person
			) {
		return "newPersonPage.jsp";
	}
	
	@PostMapping("/persons/new")
	public String addPerson(
			@Valid @ModelAttribute("person")Person person,
			BindingResult result
			) {
		if(result.hasErrors()) {
			return "newPersonPage.jsp";
		}
		else {
			Person newPerson = personRepo.addPerson(person);
			Long newPersonId = newPerson.getId();
			return "redirect:/persons/" + newPersonId;
		}
	}
	
	@GetMapping("/persons/{person_id}")
	public String showPerson(@PathVariable("person_id")Long person_id, Model model) {
	    
	    Person someAwesomePerson = personRepo.findPerson(person_id);
	    model.addAttribute("person", someAwesomePerson);
	    
	    return "showPerson.jsp";
	}
	
}
