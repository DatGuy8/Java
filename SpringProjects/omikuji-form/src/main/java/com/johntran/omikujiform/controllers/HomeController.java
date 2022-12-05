package com.johntran.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/omikuji")
public class HomeController {
	
	//HOME PAGE WITH FORM
	@RequestMapping("")
	public String omiForm() {
		
		return "omiFormPage.jsp";
	}
	
	// POST Submission with info - get info an save to session and redirect to show page
	@PostMapping("/sendform")
	public String getInfo(HttpSession session, Model model) {
		
		
		return "redirect:/show";
	}
	
	// get info from session and display the information
	@RequestMapping("/show")
	public String omiShow(HttpSession session, Model model) {
		
		
		
		return "omiShowPage.jsp";
	}
}
