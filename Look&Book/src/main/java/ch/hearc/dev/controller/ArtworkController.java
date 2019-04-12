package ch.hearc.dev.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import repository.ArtworkRepository;


@Controller
public class ArtworkController {
	ArtworkRepository artworkRepository;
	
	@GetMapping("/artworks")
    public String getAll(Map<String, Object> model) {
		
		model.put("artworks", artworkRepository.findAll());
		
        return "artwork";
	}
	
	/*@GetMapping("/artworks/{id}")
    public String artwork(@PathVariable final String id) {
        return "artwork";
	}*/
}
