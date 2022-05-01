package com.zainab.language.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zainab.language.models.Language;
import com.zainab.language.services.LanguageService;


@Controller
@RequestMapping("/languages")
public class MainController {
	
		@Autowired
		LanguageService langService;
	
		@GetMapping("")
		public String index(@ModelAttribute("lang") Language lang, Model model) {
			List<Language> languages = langService.allLanguages();
			model.addAttribute("languages", languages); 
			return "dashboard.jsp"; 
		}
		
		@PostMapping("")
		public String index(
				@Valid @ModelAttribute("lang") Language lang, 
				BindingResult results, Model model) {
			
			if(results.hasErrors()) {
				List<Language> languages = langService.allLanguages();
				model.addAttribute("languages", languages);
				return "dashboard.jsp"; 
			}
			
			else {
			
			langService.create(lang); 
			return "redirect:/languages"; 
			
			}
		}
		
		@GetMapping("/edit/{id}")
		public String edit(@PathVariable Long id, Model model) {
			Language lang = langService.findLang(id);
			model.addAttribute("lang", lang);
			return "edit.jsp";
		}
		
		
		@PutMapping("/update/{id}")
		public String update(@Valid @ModelAttribute("lang") Language lang,  
				BindingResult result, Model model) {
			
			if (result.hasErrors() ) {
				return "edit.jsp";
				
			} else {
				langService.update(lang);
				return "redirect:/languages"; 
			}
			
		}
		
		
		@GetMapping("/{id}")
		public String view(@PathVariable Long id, Model model) {
			Language lang = langService.findLang(id); 
			model.addAttribute("lang", lang); 
			return "view.jsp"; 
		
		}
		
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable Long id) {
			langService.delete(id);
			return "redirect:/languages";
		}
		
	
	

}
