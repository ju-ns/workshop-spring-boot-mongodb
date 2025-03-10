package com.juliang.workshopmongo.repository;

import com.juliang.workshopmongo.domain.Post;
import com.juliang.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {
}
