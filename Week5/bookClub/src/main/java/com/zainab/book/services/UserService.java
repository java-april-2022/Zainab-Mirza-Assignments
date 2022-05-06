package com.zainab.book.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import com.zainab.book.models.LoginUser;
import com.zainab.book.models.User;
import com.zainab.book.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository uRepo; 
	
	
	// validate user for: duplicate email or password mismatch
	public void validate(User user, Errors errors) {
		//password mismatch check
		if(!user.getPassword().equals(user.getConfirm())) {
			errors.rejectValue("password", "Mismatch", "Passwords do not match!!");
		}
		
		// duplicate email check 
		if(uRepo.findByEmail(user.getEmail())!=null) {
			errors.rejectValue("email", "unique", "Email is already taken.");
		}
	}
	
	// hash users password and add to database 
	public User regUser(User user) {
		String hashedPass=BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()); 
		user.setPassword(hashedPass);
		uRepo.save(user); 
		return null; 
		
	}
	
	// find user by email 
	public User findByEmail(User user) {
		return uRepo.findByEmail(user.getEmail()); 
	}
	
	//find user by ID 
	public User findById(Long id) {
		return uRepo.findById(id).orElse(null); 
	}
	
	
	//login authentication 
	
	public boolean authenticateUser(LoginUser loginUser, Errors errors) {
		//first find the user by email 
		
		User user= uRepo.findByEmail(loginUser.getEmail()); 
		if(user==null) {
			// if we can't find by email, return false.
			errors.rejectValue("email","missingEmail", "Email not found.");
			return false;
			
		} else {
			// check to see if the password entered matches login paswsword 
			if(!BCrypt.checkpw(loginUser.getPassword(), user.getPassword())) {
			    errors.rejectValue("password", "matches", "Invalid Password.");
			    return false; 
			}
		}
		
		return true; 
	}
	
	
}
