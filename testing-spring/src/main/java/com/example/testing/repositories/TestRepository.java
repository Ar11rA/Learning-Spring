package com.example.testing.repositories;

import com.example.testing.domains.TestModel;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestModel, Long> {
}
