package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			
		} else { 
			Integer count = (Integer) session.getAttribute("count");
			count+=1; 
			session.setAttribute("count", count);
			
		}
		
		return "index.jsp"; 
		
	}
	
	@RequestMapping("/count")
	public String showCount(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			model.addAttribute("showCount", count);
		}
		
		return "showCount.jsp";
	}

}
