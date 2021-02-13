package com.jean.shopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jean.shopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
