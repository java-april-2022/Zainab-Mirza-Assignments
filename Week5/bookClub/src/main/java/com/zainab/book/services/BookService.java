package com.zainab.book.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zainab.book.models.Book;
import com.zainab.book.repositories.BookRepository;


@Service
public class BookService {
	
	@Autowired
	private BookRepository bRepo; 
	
	
	
	public List<Book> allBooks() { 
		return bRepo.findAll(); 

	}
	
	
	//create
	public Book createBook(Book book) {
		return bRepo.save(book); 
	}
		
	
	//get one
	public Book getOne(Long id) {
	        return bRepo.findById(id).orElse(null); 
	    }
	
	 //update
	 public Book update(Book book) {
		 return bRepo.save(book); 
	 }
	 
	 //delete
	 public void delete(Long id) {
		 bRepo.deleteById(id); 
	 }
}
