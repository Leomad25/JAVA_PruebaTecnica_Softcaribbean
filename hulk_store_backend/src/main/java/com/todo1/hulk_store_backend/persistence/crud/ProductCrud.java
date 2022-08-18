package com.todo1.hulk_store_backend.persistence.crud;

import com.todo1.hulk_store_backend.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrud extends CrudRepository<Product, Long> {
    Product findByName (String name);
    Product findByReference (String reference);
}
