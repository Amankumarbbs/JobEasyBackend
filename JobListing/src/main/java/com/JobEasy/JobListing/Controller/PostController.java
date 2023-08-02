package com.JobEasy.JobListing.Controller;
import com.JobEasy.JobListing.Models.Post;
import com.JobEasy.JobListing.Repository.PostRepository;
import com.JobEasy.JobListing.Repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins= "https://joblisteasy.netlify.app/")
public class PostController {

    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepository srepo;


    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts(){
        return repo.findAll();
    }
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }
    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }

}
