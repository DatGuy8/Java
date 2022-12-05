package com.johntran.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class APIController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String datePage(Model model) {
		Date date = new Date();
		SimpleDateFormat day = new SimpleDateFormat("EEEE");
		SimpleDateFormat dayNum = new SimpleDateFormat("dd");
		SimpleDateFormat month = new SimpleDateFormat("MMMM");
		SimpleDateFormat year = new SimpleDateFormat("Y");
		
		String dayString = day.format(date);
		String dayNumString = dayNum.format(date);
		String monthString = month.format(date);
		String yearString = year.format(date);
		
		String fullString = dayString + ", the " + dayNumString + " of " + monthString + ", " + yearString;
		
		model.addAttribute("date", fullString);
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String timePage(Model model) {
		SimpleDateFormat format = new SimpleDateFormat("h:mm a");
		String time = format.format(new Date());
		model.addAttribute("time" , time);
		
		return "time.jsp";
	}

}
