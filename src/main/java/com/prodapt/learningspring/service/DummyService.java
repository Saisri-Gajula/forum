package com.prodapt.learningspring.service;

import java.util.ArrayList;
import java.util.List;

import com.prodapt.learningspring.entity.Post;
import com.prodapt.learningspring.entity.User;

public class DummyService implements InterfaceService{

	public List<Post> post;
	
	@Override
	public List<Post> getFavPosts(User user) {
		// TODO Auto-generated method stub
		List<Post> favPost = new ArrayList<Post>();
		return favPost;
		
	}
	
	public List<Post> getPopularPosts(User user){
		List<Post> popPost = new ArrayList<Post>();
		return popPost;
	}

	
//	public List<Post> favposts(){
//		
//	}
	
}
