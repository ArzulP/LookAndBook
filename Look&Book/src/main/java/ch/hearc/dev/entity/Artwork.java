package ch.hearc.dev.entity;

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
@Table(name="artwork")
public class Artwork {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column
    private Long id;
	
	@Column
	private String title;
	
	@Column
	private String author;
	
	@Column
	private String description;
	
	@Column
	private String release_data;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CATEGORY_ID")
	private Category category;
	
	@Column
	private Boolean visible;
	
	

	public Artwork() {
		
	}

	public Long getId() {
		return id;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String getReleaseData(){
		return release_data;
	}
	
	public Category getCategory(){
		return category;
	}
	
	public Boolean getVisible(){
		return visible;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setReleaseData(String release_data) {
		this.release_data = release_data;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}