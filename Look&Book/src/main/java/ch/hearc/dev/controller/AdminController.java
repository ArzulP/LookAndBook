package ch.hearc.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ch.hearc.dev.services.ArtworkService;
import ch.hearc.dev.services.CategoryService;

@Controller
public class AdminController {
		
	@GetMapping("/dashboard")
    public String aministration(Model model) {		
		return "dashboardAdmin";
    }
}
