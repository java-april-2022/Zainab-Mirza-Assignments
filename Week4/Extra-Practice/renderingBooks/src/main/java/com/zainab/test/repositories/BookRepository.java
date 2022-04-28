package com.zainab.test.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zainab.test.models.Book;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
	// this method retrieves all the books from the database 
	List<Book> findAll(); 
	// this method finds books with descriptions containing the search string
	List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
    Optional<Book> findById(Long id);
}
