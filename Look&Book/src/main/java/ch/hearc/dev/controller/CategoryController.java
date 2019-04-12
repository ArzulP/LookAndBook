package ch.hearc.dev.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import repository.CategoryRepository;

@Controller
public class CategoryController {
	CategoryRepository categoryRepository;
	
	@GetMapping("/categories")
    public String getAll(Map<String, Object> model) {
		
		model.put("categories", categoryRepository.findAll());
		
        return "categories";
	}
	@GetMapping("/categories/{id}")
    public String getDetails(Map<String, Object> model) {
		
		model.put("categories", categoryRepository.findAll());
		
        return "category";
	}
}
