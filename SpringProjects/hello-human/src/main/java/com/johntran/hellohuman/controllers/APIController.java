package com.johntran.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class APIController {

	@RequestMapping("/")
	public String index(
			@RequestParam(value = "firstname", required = false) String firstNameInMethod,
			@RequestParam(value = "lastname", required = false) String lastNameInMethod,
			@RequestParam(value = "amount", required = false) Integer amount 
			){
		if (amount != null && amount > 0) {
			String greeting = "";
			for (int i = 0; i < amount; i++) {
				if (firstNameInMethod != null && lastNameInMethod != null) {
					greeting += "Hello " + firstNameInMethod + " " + lastNameInMethod + " ";
				} else if (firstNameInMethod != null) {
					greeting += "Hello " + firstNameInMethod + " ";
				} else if (lastNameInMethod != null) {
					greeting += "Hello " + lastNameInMethod + " ";
				} else {
					greeting += "Hello Human" + " ";
				}

			}
			return greeting;
		}

		if (firstNameInMethod != null && lastNameInMethod != null) {
			return "Hello " + firstNameInMethod + " " + lastNameInMethod;
		} else if (firstNameInMethod != null) {
			return "Hello " + firstNameInMethod;
		} else if (lastNameInMethod != null) {
			return "Hello " + lastNameInMethod;
		}
		return "Hello Human";
	}
}
