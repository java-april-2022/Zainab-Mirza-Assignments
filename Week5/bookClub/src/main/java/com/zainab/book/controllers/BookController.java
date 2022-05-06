package com.zainab.book.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.zainab.book.models.Book;
import com.zainab.book.models.User;
import com.zainab.book.services.BookService;
import com.zainab.book.services.UserService;

@Controller
public class BookController {
	
	@Autowired
	UserService uService;
	
	
	@Autowired
	BookService bService;


	@GetMapping("/books/new") 
	public String form(@ModelAttribute("book") Book book, HttpSession session) {
		if(session.getAttribute("loginUser") == null) {
    		return "redirect:/";
    	} 
		
		return "add.jsp"; 
	}
	
	@PostMapping("/createBook") 
	public String add(@Valid @ModelAttribute("book") Book book, 
			BindingResult results, Model model){
		
		if(results.hasErrors()) {
			return "add.jsp"; 
			
		} else {
			bService.createBook(book); 
			return "redirect:/dashboard"; 
		}
	}
	
	
	@GetMapping("/books/{id}")
	public String view(@PathVariable Long id, Model model) {
		Book book = bService.getOne(id); 
		model.addAttribute("book", book); 
		return "view.jsp"; 
	}
	
	
	@GetMapping("/books/edit/{id}")
	public String editForm(@PathVariable Long id, Model model, HttpSession session) {
		if(session.getAttribute("loginUser") == null) {
    		return "redirect:/";
    	} 
		Book book = bService.getOne(id); 
		model.addAttribute("book", book); 
		return "edit.jsp"; 
	}
	
	@PutMapping("/update/{id}")
	public String update(@Valid @ModelAttribute("book") Book book,  
			BindingResult result, Model model) {
		
		if (result.hasErrors() ) {
			return "edit.jsp";
			
		} else {
			bService.update(book);
			return "redirect:/dashboard"; 
		}
		
	}
 
 }
