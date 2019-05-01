package ch.hearc.dev.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column
    private Long id;
	
	@Column
	private String content;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ARTWORK_ID")
	private Artwork artwork;
	
	/*@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private User user;*/
	
	@Column
	private String date = "";

	public Comment() {
		
	}

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	public Artwork getArtwork() {
		return artwork;
	}
	
	/*public User getUser() {
		return user;
	}*/
	

	public void setContent(String content) {
		this.content = content;
	}
	
	public void setArtwork(Artwork artwork) {
		this.artwork = artwork;
	}
	
	/*public void setUser(User user) {
		this.user = user;
	}*/
	
	public void setId(Long id) {
		this.id = id;
	}
}
