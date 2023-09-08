package com.prodapt.learningspring.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Comments {
	
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String comment;
	

	public Comments() {
		super();
	}

	public Comments(int id, String comment, User user, Post post) {
		super();
		this.id = id;
		this.comment = comment;
		this.user = user;
		this.post = post;
	}

	

	  @ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "user_id", referencedColumnName = "id")
	  private User user;
	  
	  @ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "post_id", referencedColumnName = "id")
	  private Post post;
	  
	  
	  
	  private Date CreateNewDate;
//	  
//	  private void setComment(String comment) {
//		  this.comment = comment;
//	  }
//	  
//	  private String getComment()
//	  {
//		  return comment;
//	  }
//	  
//	  private void setId(int id) {
//		  this.id = id;
//	  }
//
//	  private int getId() {
//		  return id;
//	  }
//	  
//	  private User getUser(User user) {
//		  return user;
//	  }
//	  private Post getPost(Post post) {
//		  return post;
//	  }
//	  private void setUser(User user) {
//		  this.user = user;
//	  }
//	  private void setPost(Post post) {
//		  this.post = post;
//	  }
}
