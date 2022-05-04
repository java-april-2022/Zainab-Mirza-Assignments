package com.zainab.dojos.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.zainab.dojos.models.Dojo;
import com.zainab.dojos.services.DojoService;

@Controller
public class DojoController {
	
	@Autowired
	DojoService dojoService;
	
	
	@GetMapping("/")
	public String index(){
		return "redirect:/dojo";
		
	}
	
	
	@GetMapping("/dojo")
	public String index(@ModelAttribute("dojo") Dojo dojo) {
		return "addDojo.jsp";
	}
	
	@PostMapping("/addDojo")
	public String index(@Valid @ModelAttribute("dojo") Dojo dojo, 
			BindingResult results, Model model) {
		
			if(results.hasErrors()) {
				return "addDojo.jsp";
			}
			
			else {
				dojoService.createDojo(dojo); 
				return "redirect:/ninja";
			}
			
	}
	
	@GetMapping("/dojo/{id}")
	public String view(@PathVariable Long id, Model model) {
		Dojo dojo = dojoService.getOne(id); 
		model.addAttribute("dojo", dojo); 
		return "allDojos.jsp"; 
	
	}
	
	
	
	
	
}
