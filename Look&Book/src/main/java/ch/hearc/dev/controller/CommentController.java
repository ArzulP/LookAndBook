package ch.hearc.dev.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ch.hearc.dev.entity.Comment;
import ch.hearc.dev.repository.CommentRepository;
import ch.hearc.dev.services.CommentService;



@Controller
public class CommentController {
	CommentRepository commentRepository;
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/comment/insert/{id}")
	public String insertComment(@PathVariable final String id, @ModelAttribute Comment comment, Model model) {
			
		commentService.saveComment(comment);
		
		return "redirect:/artwork/{id}";
	}
	
	
	@PostMapping("/comment/delete/{id}")
	private String deleteComment(@PathVariable final String id){
		commentService.deleteById(Long.parseLong(id));
	    return "redirect:/artworks";
	}
}
