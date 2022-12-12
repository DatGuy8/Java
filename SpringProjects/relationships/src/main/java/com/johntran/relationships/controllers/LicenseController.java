package com.johntran.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.johntran.relationships.models.License;
import com.johntran.relationships.models.Person;
import com.johntran.relationships.services.LicenseService;
import com.johntran.relationships.services.PersonService;

@Controller
public class LicenseController {
	
	@Autowired
	PersonService personRepo;
	
	@Autowired
	LicenseService licenseRepo;
	
	@GetMapping("/licenses/new")
	public String licenseFormPage(
			Model model,
			@ModelAttribute("license")License license
			) {
		List<Person> persons = personRepo.allPersons();
		model.addAttribute("persons", persons);
		return "newLicensePage.jsp";
		
	}
	
	@PostMapping("/licenses")
	public String licenses(@Valid @ModelAttribute("license") License license) {
	    // error handling with binding result omitted    
	    License newLicense = licenseRepo.addLicense(license); // Already has the person!
	    
	    Long id = newLicense.getPerson().getId();
	    return "redirect:/persons/"+ id;
	}
	
}
