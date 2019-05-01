package ch.hearc.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ch.hearc.dev.entity.Comment;


@Repository("commentRepository")
public interface CommentRepository extends JpaRepository <Comment, Long>{
	 @Query("SELECT c FROM Comment c where c.artwork.id = :id")
	 public List<Comment> findCommentByArtId(@Param("id") Long id);
	
}
