package com.zainab.book.repositories;

import org.springframework.data.repository.CrudRepository;

import com.zainab.book.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByEmail(String email);

}
