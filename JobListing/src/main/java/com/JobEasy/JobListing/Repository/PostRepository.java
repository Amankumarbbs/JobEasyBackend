package com.JobEasy.JobListing.Repository;

import com.JobEasy.JobListing.Models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {


}
