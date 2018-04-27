package com.example.mysql.controllers;

import com.example.mysql.models.PostDTO;
import com.example.mysql.services.IPostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(path = "/posts")
public class PostController {

    private IPostService postService;

    public PostController(IPostService postService) {
        this.postService = postService;
    }

    @RequestMapping(path = {"/",""}, method = RequestMethod.GET)
    public ResponseEntity<List<PostDTO>> getAllPosts(){
        List<PostDTO> posts = postService.getAllPosts();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }
}
