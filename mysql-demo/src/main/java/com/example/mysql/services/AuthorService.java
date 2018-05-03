package com.example.mysql.services;

import com.example.mysql.mappers.AuthorMapper;
import com.example.mysql.mappers.BookMapper;
import com.example.mysql.models.AuthorDTO;
import com.example.mysql.models.BookDTO;
import com.example.mysql.repositories.AuthorRepository;
import com.example.mysql.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService implements IAuthorService {

    private AuthorRepository authorRepository;
    private AuthorMapper authorMapper;
    private BookRepository bookRepository;
    private BookMapper bookMapper;

    public AuthorService(AuthorRepository authorRepository, AuthorMapper authorMapper, BookRepository bookRepository, BookMapper bookMapper) {
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public List<AuthorDTO> getAuthors() {
        return authorRepository.findAll()
                .stream()
                .map(authorMapper::authorToAuthorDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<BookDTO> getBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::bookToBookDTO)
                .collect(Collectors.toList());
    }

}
