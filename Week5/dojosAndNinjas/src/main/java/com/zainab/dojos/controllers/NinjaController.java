package com.zainab.dojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zainab.dojos.models.Dojo;
import com.zainab.dojos.models.Ninja;
import com.zainab.dojos.services.DojoService;
import com.zainab.dojos.services.NinjaService;

@Controller
public class NinjaController {

	@Autowired
	private NinjaService ninjaService;
	
	@Autowired
	private DojoService dojoService; 
	
	
	@GetMapping("/ninja") 
	public String addNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos(); 
		model.addAttribute("dojos", dojos); 
		return "addNinja.jsp"; 
	}
	
	
	@PostMapping("/addNinja")
	public String form(@Valid @ModelAttribute("ninja") Ninja ninja, 
			BindingResult results, Model model) {
		if(results.hasErrors()) {
			List<Dojo> dojos = dojoService.allDojos(); 
			model.addAttribute("dojos", dojos); 
			return "addNinja.jsp";
		}
		
		else {
		
		ninjaService.createNinja(ninja);
		return "redirect:/dojo/" + ninja.getDojo().getId(); 
		
		}
	}

}

