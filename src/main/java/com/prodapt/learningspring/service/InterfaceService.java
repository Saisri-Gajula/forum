package com.prodapt.learningspring.service;

import java.util.ArrayList;
import java.util.List;

import com.prodapt.learningspring.entity.Post;
import com.prodapt.learningspring.entity.User;

public interface InterfaceService  {

	public List<Post> post = new ArrayList<Post>();
	
	public List<Post> getFavPosts(User user);
	
	public List<Post> getPopularPosts(User user);
}
