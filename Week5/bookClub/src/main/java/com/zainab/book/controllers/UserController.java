package com.zainab.book.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zainab.book.models.Book;
import com.zainab.book.models.LoginUser;
import com.zainab.book.models.User;
import com.zainab.book.repositories.UserRepository;
import com.zainab.book.services.BookService;
import com.zainab.book.services.UserService;

@Controller
public class UserController {

	@Autowired 
	UserService uService; 
	
	@Autowired 
	BookService bService; 
	
	@Autowired
	UserRepository uRepo;

	// renders the login page
	@GetMapping("/")
	public String index(@ModelAttribute("loginUser") LoginUser loginUser ) {
		return "index.jsp";
	}
	
	
	//rendering the registration page
	@GetMapping("/registration")
	public String registeration(@ModelAttribute("user") User user) {
		return "register.jsp";
	}
	
	
	//register a user
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult results, HttpSession session, @ModelAttribute("loginUser") LoginUser loginUser) {
		//validate user
		uService.validate(user, results);
		if(results.hasErrors()) {
			return "register.jsp";
		}
		//register user
		uService.regUser(user); 
		// put user in session
		session.setAttribute("loginUser", user);
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
	public String dashboard(@ModelAttribute("book") Book book, Model model, HttpSession session) {
		if(session.getAttribute("loginUser") != null) {
    		model.addAttribute("allBooks", bService.allBooks()); 
			return "dashboard.jsp";
    	}
		 
		return "redirect:/";
		
	}
}
