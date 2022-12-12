package com.johntran.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String getInfo(
			@RequestParam(value="years") Integer years,
			@RequestParam(value="city") String city,
			@RequestParam(value="roommate") String roommate,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="livingThing") String livingThing,
			@RequestParam(value="somethingNice") String somethingNice,
			HttpSession session
			) {
		
		session.setAttribute("years", years);
		session.setAttribute("city", city);
		session.setAttribute("roommate", roommate);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("somethingNice", somethingNice);
		
		
		return "redirect:/omikuji/show";
	}
	
	// get info from session and display the information
	@RequestMapping("/show")
	public String omiShow() {
		
		
		
		return "omiShowPage.jsp";
	}
}
