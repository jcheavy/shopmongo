package com.jean.shopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jean.shopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
