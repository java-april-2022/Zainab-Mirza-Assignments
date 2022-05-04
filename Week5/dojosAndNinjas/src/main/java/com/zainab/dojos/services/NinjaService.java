package com.zainab.dojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zainab.dojos.models.Dojo;
import com.zainab.dojos.models.Ninja;
import com.zainab.dojos.repositories.DojoRepository;
import com.zainab.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	DojoRepository dojoRepo;
	
	@Autowired
	private DojoService dojoService; 
	
	@Autowired
	NinjaRepository ninjaRepo;
	
	 public Ninja createNinja(Ninja ninja) {
	        return ninjaRepo.save(ninja);
	    }
	 
	
}


