package com.example.mysql.services;

import com.example.mysql.models.PostDTO;

import java.util.List;

public interface IPostService {
    public List<PostDTO> getAllPosts();
}
