package com.todo1.hulk_store_backend.domain.repository;

import com.todo1.hulk_store_backend.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<Product> getById(long id);
    Optional<Product> getByName(String name);
    Optional<Product> getByReference(String name);
    Product save(Product product);
    void delete(long id);
}
