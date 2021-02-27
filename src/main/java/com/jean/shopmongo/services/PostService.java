package com.jean.shopmongo.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jean.shopmongo.domain.Post;
import com.jean.shopmongo.repositories.PostRepository;
import com.jean.shopmongo.services.exception.ObjectNotFoundExecption;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	
	public Post findById(String id) {
		Post user = postRepository.findById(id).get();
		if (user == null) {
			throw new ObjectNotFoundExecption("Objeto não encontrado");
		}
		return user;
	}

	
	public List<Post> findByTitle(String text) {
		//return postRepository.findByTitleContainingIgnoreCase(text);
		return postRepository.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return postRepository.fullSearch(text, minDate, maxDate);
	}
}
