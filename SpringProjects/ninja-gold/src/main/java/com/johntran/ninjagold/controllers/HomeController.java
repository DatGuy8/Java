package com.johntran.ninjagold.controllers;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	// get gold from session and display on page
	@RequestMapping("/gold")
	public String goldHome(HttpSession session) {

		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}

		return "goldPage.jsp";
	}

	
	
	
	
// ================get gold value from form=================
	@PostMapping("/processgold")
	public String addUpGold(HttpSession session, @RequestParam(value = "location") String location) {

//======== gets gold balance so far ===================
		int goldBalance = (int) session.getAttribute("gold");

//========= random balance between 10 and 20 for gold in certain areas ===============		
		Random random = new Random();
		int rand = random.nextInt(10, 21);

//================== 0-80 if higher then 80 will count as failed quest ======================		
		int questRandom = random.nextInt(0, 81);
		System.out.println(questRandom);
		if (questRandom > 50) {
			questRandom = -50;
		}
		System.out.println(questRandom);

//		ArrayList<String> activities = new ArrayList<String>();
//========= adds random numbers to gold =======================================
		if (location.equals("farm")) {
			session.setAttribute("gold", goldBalance + rand);
//			activities.add("You entered a farm and earned " + rand +" gold.");
//			session.setAttribute("activities", activities);
		}
		if (location.equals("cave")) {
			session.setAttribute("gold", goldBalance + rand);
		}
		if (location.equals("house")) {
			session.setAttribute("gold", goldBalance + rand);
		}
		if (location.equals("quest")) {
			session.setAttribute("gold", goldBalance + questRandom);
		}
//========Reset button ========================================
		if (location.equals("reset")) {
			session.setAttribute("gold", 0);
		}

		return "redirect:/gold";
	}

}
