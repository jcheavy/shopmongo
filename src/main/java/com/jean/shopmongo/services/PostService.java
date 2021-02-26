package com.jean.shopmongo.services;

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

}
