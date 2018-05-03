package com.example.mysql.controllers;

import com.example.mysql.models.AuthorBaseDTO;
import com.example.mysql.models.AuthorDTO;
import com.example.mysql.models.BookDTO;
import com.example.mysql.services.IAuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(path = "/authors")
public class AuthorController {

    private IAuthorService authorService;

    public AuthorController(IAuthorService authorService) {
        this.authorService = authorService;
    }


    @RequestMapping(path = {"/", ""}, method = RequestMethod.GET)
    public ResponseEntity<List<AuthorDTO>> getAllAuthors() {
        List<AuthorDTO> authors = authorService.getAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }


    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public ResponseEntity<List<BookDTO>> getAllBooks() {
        List<BookDTO> books = authorService.getBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
