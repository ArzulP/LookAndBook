package ch.hearc.dev.services;


import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hearc.dev.entity.Comment;
import ch.hearc.dev.repository.CommentRepository;


@Service("commentService")
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentRepository commentRepository;

	@Override
	public void saveComment(Comment comment) {
		commentRepository.save(comment);
		
	}

	@Override
	public Iterable<Comment> findAllForArtId(Long id) {
		return commentRepository.findCommentByArtId(id);
	}

	@Override
	public void deleteById(Long id) {
		commentRepository.deleteById(id);
	}

}
