package com.zainab.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zainab.lookify.models.Song;
import com.zainab.lookify.services.SongService;

@Controller
public class MainController {
	
		@Autowired
		SongService songService; 
	
		@GetMapping("/")
		public String index() {
			return "index.jsp"; 
		}
		
		@GetMapping("/dashboard")
		public String dashboard(@ModelAttribute("song") Song song, Model model) {
			List<Song> allSongs = songService.allSongs();
			model.addAttribute("allSongs", allSongs);
			return "dashboard.jsp";
		}
		
		
		//request param for user to search artist 
		@PostMapping("/dashboard")
		public String dashboard(@RequestParam("artist") String artist, Model model) {
			model.addAttribute("artist", artist);
			return "redirect:/search/"+artist;
		}
	
		
		//renders after you search specific artist
		@GetMapping("/search/{artist}")
		public String search(@PathVariable("artist") String artist, Model model) {
			List<Song> songs = songService.findArtist(artist);
			model.addAttribute("songs", songs);
			return "artist.jsp";
		}
		
		
		@GetMapping("/songs/new")
		public String form(@ModelAttribute("song") Song song) {
			return "add.jsp";
		}
		
		
		@PostMapping("/add")
		public String create(
				@Valid @ModelAttribute("song") Song song, 
				BindingResult results, Model model) {
			
			if(results.hasErrors()) {
				return "add.jsp";
			}
			
			else {
			
			songService.addSong(song); 
			return "redirect:/dashboard"; 
			
			}
		}
		
		@GetMapping("/songs/{id}")
		public String viewSong(@PathVariable Long id, Model model) {
			Song song = songService.findSong(id); 
			model.addAttribute("song", song); 
			return "song.jsp"; 
		
		}

		
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable Long id) {
			songService.delete(id);
			return "redirect:/dashbaord";
		}
		
		

}
