package ch.hearc.dev.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ch.hearc.dev.entity.Category;
import ch.hearc.dev.repository.CategoryRepository;
import ch.hearc.dev.services.CategoryService;

@Controller
public class CategoryController {
	CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/category/form")
	public String personForm(Model model) {
		
		model.addAttribute("category", new Category());
		
		return "category-form";
	}
	
	@PostMapping("/category/insert")
	public String insertCategory(@ModelAttribute Category category, Model model) {
			
		categoryService.saveCategory(category);
		
		return "index";
		
	}
}
