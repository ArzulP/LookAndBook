package ch.hearc.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ch.hearc.dev.services.ArtworkService;
import ch.hearc.dev.services.CategoryService;

@Controller
public class AdminController {
	@Autowired
	private ArtworkService artworkService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/dashboard")
    public String aministration(Model model) {
		model.addAttribute("categories", categoryService.findAll());
		model.addAttribute("artworks", artworkService.findAll());
		return "dashboardAdmin";
    }
}
