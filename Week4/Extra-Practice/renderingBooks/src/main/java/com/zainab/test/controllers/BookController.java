package com.zainab.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zainab.test.models.Book;
import com.zainab.test.services.BookService;

@Controller
public class BookController {
	
		@Autowired
		private BookService bookService;
		
	@GetMapping("/books/{id}") 
	public String index(Model model, @PathVariable("id") Long id) {
		
		System.out.println(id); 
		Book book = bookService.getBook(id);
		System.out.println(book); 
		
		model.addAttribute("book", book);
		
		return "index.jsp";
	}

}
