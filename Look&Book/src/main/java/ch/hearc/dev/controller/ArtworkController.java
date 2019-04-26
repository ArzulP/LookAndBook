package ch.hearc.dev.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ch.hearc.dev.entity.Artwork;
import ch.hearc.dev.repository.ArtworkRepository;
import ch.hearc.dev.services.ArtworkService;
import ch.hearc.dev.services.CategoryService;


@Controller
public class ArtworkController {
	ArtworkRepository artworkRepository;
	
	@Autowired
	private ArtworkService artworkService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/artworks")
    public String getAll(Model model) {
			
		model.addAttribute("artworks", artworkService.findAll());
        return "artwork";
	}
	
	@GetMapping("/artwork/form")
	public String personForm(Model model) {

		model.addAttribute("categories", categoryService.findAll());
		model.addAttribute("artwork", new Artwork());
		
		return "artwork-form";
	}
	
	@PostMapping("/artwork/insert")
	public String insertArtwork(@ModelAttribute Artwork artwork, Model model) {
			
		artworkService.saveArtwork(artwork);
		model.addAttribute("artworks", artworkService.findAll());
		return "artwork";
		
	}
	
	@GetMapping("/artwork/{id}")
    public String artwork(@PathVariable final String id, Model model) {
		model.addAttribute("artwork", artworkService.findArtworkById(Long.parseLong(id)));
        return "artwork-detail";
	}
}
