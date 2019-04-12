package ch.hearc.dev.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ch.hearc.dev.entity.Artwork;
import repository.ArtworkRepository;
import services.ArtworkService;


@Controller
public class ArtworkController {
	ArtworkRepository artworkRepository;
	
	@Autowired
	private ArtworkService userService;
	
	@GetMapping("/artworks")
    public Iterable<Artwork> getAll(Map<String, Object> model) {
        return userService.findAll();
	}
	
	/*@GetMapping("/artworks/{id}")
    public String artwork(@PathVariable final String id) {
        return "artwork";
	}*/
}
