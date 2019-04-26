package ch.hearc.dev.services;

import ch.hearc.dev.entity.Comment;

public interface CommentService {
	public void saveComment(Comment comment);
	public Iterable<Comment> findAllForArtId(Long id);
}
