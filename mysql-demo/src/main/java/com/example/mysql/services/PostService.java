package com.example.mysql.services;

import com.example.mysql.mappers.PostMapper;
import com.example.mysql.models.PostDTO;
import com.example.mysql.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService implements IPostService {

    private PostRepository postRepository;
    private PostMapper postMapper;

    @Autowired
    public PostService(PostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    @Override
    public List<PostDTO> getAllPosts() {
        return postRepository.findAll()
                .stream()
                .map(postMapper::postToPostDTO)
                .collect(Collectors.toList());
    }
}
