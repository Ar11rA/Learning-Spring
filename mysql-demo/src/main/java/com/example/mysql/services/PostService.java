package com.example.mysql.services;

import com.example.mysql.domains.Post;
import com.example.mysql.exceptions.ResourceNotFoundException;
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

    @Override
    public PostDTO getPostById(Long id) {
        return postRepository.findById(id)
                .map(postMapper::postToPostDTO)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public PostDTO createNewPost(PostDTO postDTO) {
       Post post = postMapper.postDtoToPost(postDTO);
       Post savedPost = postRepository.save(post);
       PostDTO savedPostDTO = postMapper.postToPostDTO(savedPost);
       return savedPostDTO;
    }

    @Override
    public PostDTO updatePostById(Long id, PostDTO postDTO) {
        return postRepository.findById(id).map(post -> {

            if(postDTO.getName() != null){
                post.setName(postDTO.getName());
            }

            if(postDTO.getDescription() != null){
                post.setDescription(postDTO.getDescription());
            }

            PostDTO returnDto = postMapper.postToPostDTO(postRepository.save(post));

            return returnDto;

        }).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public void deletePostById(Long id) {
      postRepository.deleteById(id);
    }
}
