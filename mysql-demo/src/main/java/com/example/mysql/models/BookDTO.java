package com.example.mysql.models;

import java.util.HashSet;
import java.util.Set;

public class BookDTO {
    private Long id;
    private String title;
    private String isbn;
    private String publisher;
    private Set<AuthorBaseDTO> authors = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<AuthorBaseDTO> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorBaseDTO> authors) {
        this.authors = authors;
    }

}
