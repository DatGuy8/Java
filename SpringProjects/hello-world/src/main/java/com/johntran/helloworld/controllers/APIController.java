package com.johntran.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class APIController {

	@RequestMapping("")
	public String index() {
		return "Index Page";
	}

	@RequestMapping("/world")
	public String displayWorld() {
		return "Hello World";
	}
	
	
}
