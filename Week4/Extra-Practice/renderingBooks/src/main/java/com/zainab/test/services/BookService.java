package com.zainab.test.services;

import org.springframework.stereotype.Service;

import com.zainab.test.models.Book;
import com.zainab.test.repositories.BookRepository;

import java.util.List;
import java.util.Optional; 

@Service
public class BookService {
	private final BookRepository bookRepo; 
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo; 
	}
	
	// return all books 
	List<Book> allBooks() {
		return bookRepo.findAll();
	}
	
	
	

	public Book getBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id); 
		if(optionalBook.isPresent()) {
			return optionalBook.get(); 
		}	else {
		return null; 
	} 
	
	}

}
