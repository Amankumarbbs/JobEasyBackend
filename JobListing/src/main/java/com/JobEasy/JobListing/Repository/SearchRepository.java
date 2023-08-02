package com.JobEasy.JobListing.Repository;

import com.JobEasy.JobListing.Models.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);

}
