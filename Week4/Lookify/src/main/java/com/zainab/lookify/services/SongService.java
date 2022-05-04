package com.zainab.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zainab.lookify.models.Song;
import com.zainab.lookify.repositories.SongRepository;

@Service
public class SongService {
	
	@Autowired
	SongRepository songRepo; 
	
	public List<Song> allSongs(){
		return songRepo.findAll(); 
	}
	
	public void addSong(Song song) {
		songRepo.save(song); 
	}
	
	
	 	public Song findSong(Long id) {
	        Optional<Song> optionalSong = songRepo.findById(id);
	        if(optionalSong.isPresent()) {
	            return optionalSong.get();
	        } else {
	            return null;
	        }
	    }
	
	 
	 
	 	public List<Song> findArtist(String artist) {
			return songRepo.findByArtistContaining(artist);
		}

		
		public void delete(Long id) {
			songRepo.deleteById(id);
			
		}

		

}
