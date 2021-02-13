package com.jean.shopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jean.shopmongo.domain.User;
import com.jean.shopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private  UserRepository userRepository;
	
	public List<User> findAll(){
		
		return  userRepository.findAll();
		
	}
}
