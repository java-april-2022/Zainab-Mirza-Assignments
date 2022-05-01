package com.zainab.language.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zainab.language.models.Language;
import com.zainab.language.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
	LanguageRepository langRepo; 
	
	
	public List<Language> allLanguages() {
		return langRepo.findAll(); 
	}
	
	public void create(Language lang) {
		langRepo.save(lang); 
	}
	
	 public Language findLang(Long id) {
	        Optional<Language> optionalLang= langRepo.findById(id);
	        if(optionalLang.isPresent()) {
	            return optionalLang.get();
	        } else {
	            return null;
	        }
	    }
	 
	 public void update(Language lang) {
		 langRepo.save(lang);
	 }
	 
	 public void delete(Long id) {
		 langRepo.deleteById(id); 
	 }
	 
}
