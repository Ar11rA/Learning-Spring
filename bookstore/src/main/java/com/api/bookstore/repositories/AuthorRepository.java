package com.api.bookstore.repositories;

import com.api.bookstore.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
