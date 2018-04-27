package com.example.mysql.services;

import com.example.mysql.models.PostDTO;

import java.util.List;

public interface IPostService {
    public List<PostDTO> getAllPosts();
    PostDTO getPostById(Long id);
    PostDTO createNewPost(PostDTO postDTO);
    PostDTO updatePostById(Long id, PostDTO postDTO);
    void deletePostById(Long id);
}
