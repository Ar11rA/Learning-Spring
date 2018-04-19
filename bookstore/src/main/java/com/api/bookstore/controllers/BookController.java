package com.api.bookstore.controllers;

import com.api.bookstore.models.Book;
import com.api.bookstore.repositories.AuthorRepository;
import com.api.bookstore.repositories.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/books")
    public ResponseEntity<Iterable<Book>> getBooks() {
        Iterable<Book> books = bookRepository.findAll();

        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.map(book -> new ResponseEntity<>(book, HttpStatus.OK)).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
