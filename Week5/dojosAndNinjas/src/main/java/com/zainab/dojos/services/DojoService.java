package com.zainab.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zainab.dojos.models.Dojo;
import com.zainab.dojos.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	DojoRepository dojoRepo;
	
	public List<Dojo> allDojos() { 
		return dojoRepo.findAll(); 

	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo); 
	}
	
	 public Dojo getOne(Long id) {
	        return dojoRepo.findById(id).orElse(null); 
	    }
	
}
