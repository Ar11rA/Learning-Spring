package com.example.mysql.models;


import java.util.HashSet;
import java.util.Set;

public class AuthorDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Set<BookBaseDTO> books  = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<BookBaseDTO> getBooks() {
        return books;
    }

    public void setBooks(Set<BookBaseDTO> books) {
        this.books = books;
    }
}
