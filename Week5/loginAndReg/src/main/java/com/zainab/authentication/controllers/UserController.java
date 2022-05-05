package com.zainab.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zainab.authentication.models.LoginUser;
import com.zainab.authentication.models.User;
import com.zainab.authentication.repositories.UserRepository;
import com.zainab.authentication.services.UserService;

@Controller
public class UserController {

	@Autowired 
	UserService uService; 
	
	@Autowired
	UserRepository uRepo;

	// renders the login and registration page
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user, @ModelAttribute("loginUser") LoginUser loginUser ) {
		return "index.jsp";
	}
	
	//register a user
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult results, HttpSession session, @ModelAttribute("loginUser") LoginUser loginUser) {
		//validate user
		uService.validate(user, results);
		if(results.hasErrors()) {
			return "index.jsp";
		}
		//register user
		uService.regUser(user); 
		// put user in session
		session.setAttribute("loggedinUser", user);
		return "redirect:/dashboard";
	}

	
	//login
	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("loginUser") LoginUser loginUser, BindingResult results, HttpSession session, @ModelAttribute("user") User user) {
		
		uService.authenticateUser(loginUser, results); 
		if(results.hasErrors()) {
			return "index.jsp"; 
		}
		User loggedInUser=uRepo.findByEmail(loginUser.getEmail());  
		session.setAttribute("loginUser", loggedInUser); 
		return "redirect:/dashboard";
	}
	
	//logout
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate(); 
		return "redirect:/";
	}
	
	//render dashboard
	@GetMapping("/dashboard") 
	public String dashboard(HttpSession session) {
		
		if(session.getAttribute("loginUser")!=null) {
			return "dashboard.jsp";
		}
		return "redirect:/";
	}
}
