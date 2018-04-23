package com.example.recipes.repositories;

import com.example.recipes.domains.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
