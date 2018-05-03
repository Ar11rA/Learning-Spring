package com.example.mysql.services;

import com.example.mysql.models.AuthorDTO;
import com.example.mysql.models.BookDTO;

import java.util.List;

public interface IAuthorService {
    List<AuthorDTO> getAuthors();
    List<BookDTO> getBooks();
}
