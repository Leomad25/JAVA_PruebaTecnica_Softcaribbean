package com.todo1.hulk_store_backend.persistence.entity;

import com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasUserHasProduct;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    // Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long idProduct;
    @Column(name = "name", length = 45, nullable = false)
    private String name;
    @Column(name = "reference", length = 45, nullable = false)
    private String reference;
    @Column(name = "count")
    private Integer count;

    // References
    @OneToMany(mappedBy = "product")
    private List<InvoiceHasUserHasProduct> invoicesHasUsersHasProducts;


    public Product() {
    }

    public Product(Long idProduct, String name, String reference, Integer count) {
        this.idProduct = idProduct;
        this.name = name;
        this.reference = reference;
        this.count = count;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<InvoiceHasUserHasProduct> getInvoicesHasUsersHasProducts() {
        return invoicesHasUsersHasProducts;
    }

    public void setInvoicesHasUsersHasProducts(List<InvoiceHasUserHasProduct> invoicesHasUsersHasProducts) {
        this.invoicesHasUsersHasProducts = invoicesHasUsersHasProducts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", reference='" + reference + '\'' +
                ", count=" + count +
                '}';
    }
}
