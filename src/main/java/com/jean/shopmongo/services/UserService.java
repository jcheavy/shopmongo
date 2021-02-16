package com.jean.shopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jean.shopmongo.domain.User;
import com.jean.shopmongo.dto.UserDTO;
import com.jean.shopmongo.repositories.UserRepository;
import com.jean.shopmongo.services.exception.ObjectNotFoundExecption;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(String id) {
		User user = userRepository.findById(id).get();
		if (user == null) {
			throw new ObjectNotFoundExecption("Objeto não encontrado");
		}
		return user;
	}

	public User insert(User obj) {
		return userRepository.insert(obj);
	}

	public void delete(String id) {
		findById(id);
		userRepository.deleteById(id);;
	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}

}
