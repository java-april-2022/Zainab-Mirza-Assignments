package com.zainab.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zainab.dojos.models.Ninja;



@Repository 
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	

}
