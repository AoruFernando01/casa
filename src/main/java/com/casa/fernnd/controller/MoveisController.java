package com.casa.fernnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoveisController {

	@GetMapping("/home")
	public String Home(){
		return "home"; 
	}
}
