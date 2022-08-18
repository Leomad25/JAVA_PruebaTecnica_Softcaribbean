package com.todo1.hulk_store_backend.persistence.implement;

import com.todo1.hulk_store_backend.persistence.crud.ProductCrud;
import com.todo1.hulk_store_backend.persistence.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductImplement {
    private ProductCrud productCrud;

    public List<Product> getAll() {
        return (List<Product>) productCrud.findAll();
    }
    public Optional<Product> getById(Long idProduct) {
        return productCrud.findById(idProduct);
    }
    public Product getByName(String name) {
        return productCrud.findByName(name);
    }
    public Product getByReference(String reference) {
        return productCrud.findByReference(reference);
    }
    public Product save(Product product) {
        return productCrud.save(product);
    }
    public void delete(Long idProduct) {
        productCrud.deleteById(idProduct);
    }
}
