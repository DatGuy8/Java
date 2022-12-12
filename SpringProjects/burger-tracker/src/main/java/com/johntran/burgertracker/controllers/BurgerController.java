package com.johntran.burgertracker.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.johntran.burgertracker.models.Burger;
import com.johntran.burgertracker.services.BurgerService;

@Controller
public class BurgerController {
	
	@Autowired
	BurgerService repo;
	
//=========Shows all burgers and display a add a burger form================
	@GetMapping("/")
	public String homePage(
			Model model,
			@ModelAttribute("burger") Burger burger
			) {
		
		List<Burger> burgers = repo.allBurgers();
		model.addAttribute("burgers", burgers);
		
		return "dashboard.jsp";
	}
	
	@PostMapping("/")
	public String addBurger(
			Model model,
			@Valid @ModelAttribute("burger") Burger burger,
			BindingResult result
			) {
		if(result.hasErrors()) {
			List<Burger> burgers = repo.allBurgers();
			model.addAttribute("burgers", burgers);
			return "dashboard.jsp";
		}
		repo.createBurger(burger);
		return "redirect:/";
	}

//=============Edit Burger Page===============================
	@GetMapping("/burgers/edit/{id}")
	public String editBurger(@PathVariable("id")Long id, Model model) {
		Burger burger = repo.findBurger(id);
		model.addAttribute(burger);
		return "editBurger.jsp";
	}

//========Edit Burger Put Route redirects to dashboard after===============
	@PutMapping("/burgers/{id}")
	public String updateBurger(
			@Valid @ModelAttribute("burger")Burger burger, 
			BindingResult result
			) {
		if(result.hasErrors()) {
			return "editBurger.jsp";
		}
		else {
			repo.updateBurger(burger);
			return "redirect:/";			
		}
		
	}
//=====================Delete A Burger=======================
	@DeleteMapping("/burgers/{id}")
	public String destroyBurger(@PathVariable("id")Long id) {
		repo.deleteBurger(id);
		return "redirect:/";
	}
}
