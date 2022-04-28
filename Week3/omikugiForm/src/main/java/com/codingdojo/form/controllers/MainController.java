package com.codingdojo.form.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index.jsp"; 
	}
	
	@PostMapping(value="/login")
	private String results(
		@RequestParam(value="email") String email,
		@RequestParam(value="password") String password) {
			return "redirect:/dashboard";
	}
}
		
