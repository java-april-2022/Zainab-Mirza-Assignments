package com.zainab.daikichi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable; 

@Controller
@RequestMapping("/daikichi")
public class RESTController {
	@RequestMapping("")
	public String index(Model model) {
		
		String firstName = "Zainab"; 
		String lastName = "Mirza"; 
		String email = "gotzainab1@hotmail.com";
		
		model.addAttribute("first", firstName);
		model.addAttribute("last", lastName);
		model.addAttribute("email", email);
		return "demo.jsp"; 
	}
	
	
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city; 
	}
	
	@RequestMapping("/lotto/{num}")
		public String lotto (@PathVariable("num") Integer num) {
			if (num%2 == 0) {
				return "You will take a grand journey in the near future, but be wary of tempting offers..."; 
				
			} else {
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends."; 
			}
	}

}
