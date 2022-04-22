package com.zainab.form.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji"; 
	}
	
	@GetMapping("/omikuji")
	public String form() {
		return "index.jsp"; 
	}
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String city = (String) session.getAttribute("city"); 
		Integer number =  (Integer) session.getAttribute("number");
		String person = (String) session.getAttribute("person");
		String hobby = (String) session.getAttribute("hobby");
		String species = (String) session.getAttribute("species");
		String compliment = (String) session.getAttribute("compliment");
		
		model.addAttribute("city", city); 
		model.addAttribute("number", number); 
		model.addAttribute("person", person); 
		model.addAttribute("hobby", hobby); 
		model.addAttribute("species", species); 
		model.addAttribute("compliment", compliment); 
		return "show.jsp";
		
	}
	
	@PostMapping("/send")
	public String send(
			@RequestParam(value="city") String city,
			@RequestParam(value="number") Integer number,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="species") String species,
			@RequestParam(value="compliment") String compliment,
			HttpSession session) {
		
		session.setAttribute("city", city);
		session.setAttribute("number", number);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("species", species);
		session.setAttribute("compliment", compliment);
		
		
		return "redirect:/omikuji/show";
	}
}
