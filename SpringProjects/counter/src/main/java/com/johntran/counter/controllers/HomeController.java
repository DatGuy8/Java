package com.johntran.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(HttpSession session) {
		session.setAttribute("counter", 0);
		return "homeScreen.jsp";
	}
	
	
	@RequestMapping("/counter")
	public String countPage(HttpSession session, Model model) {
		if(session.getAttribute("counter") == null) {
			session.setAttribute("counter", 1);
			model.addAttribute("count", 1);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("counter") + 1;
			session.setAttribute("counter", currentCount);
			model.addAttribute("count", currentCount);
		}
		
		
		return "counterPage.jsp";
	}
	
	
	@RequestMapping("/counter/plus2")
	public String addTwo(HttpSession session, Model model) {
		if(session.getAttribute("counter") == null) {
			session.setAttribute("counter", 2);
			model.addAttribute("count", 2);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("counter") + 2;
			session.setAttribute("counter", currentCount);
			model.addAttribute("count", currentCount);
		}
		
		return "countTwo.jsp";
	}
	
	
}
