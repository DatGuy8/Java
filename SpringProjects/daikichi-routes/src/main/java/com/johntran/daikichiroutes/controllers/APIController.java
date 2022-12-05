package com.johntran.daikichiroutes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/daikichi")
public class APIController {
	
	@RequestMapping("")
	public String daikichiIndex() {
		
		return "demo.jsp";
	}
	
	@RequestMapping("/today")
	public String daiToday() {
		return "Today you will find luck in all your endeavors!";
	}

	@RequestMapping("/tomorrow")
	public String daiTomorrow() {
		return "Tomorrow, an opportunity will aarise, so be sure to be open to new ideas!";
	}
	//daichi/travel/"city name"  ---- "Congratulation! You will soon travel to Honolulu!"
	@RequestMapping("/travel/{city}")
	public String showTravel(@PathVariable("city")String city) {
		return "Congradulations! You will soon trave to " + city;
	}
	//daichi/lotto/6   or 37   --- YOu will take a grand journey in the near future, but be wary of temting offers
	//You have enjoyed the fruits of you labor but now is a great time to spend time with family and friends.
	@RequestMapping("/lotto/{num}")
	public String lottoShow(@PathVariable("num")Integer num) {
		if(num%2 == 1) {
			return "You have enjoyed the fruits of you labor but now is a great time to spend time with family and friends.";
		}
		return "You will take a grand journey in the near future, but be wary of tempting offers";
	}
	
}


