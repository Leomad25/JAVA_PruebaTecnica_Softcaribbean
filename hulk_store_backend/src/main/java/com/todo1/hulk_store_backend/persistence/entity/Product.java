package com.todo1.hulk_store_backend.persistence.entity;

import com.todo1.hulk_store_backend.persistence.entity.compound.InvoiceHasProduct;

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

    // References
    @OneToMany(mappedBy = "product")
    private List<InvoiceHasProduct> invoicesHasProducts;

    public Product() {
    }

    public Product(Long idProduct, String name, String reference) {
        this.idProduct = idProduct;
        this.name = name;
        this.reference = reference;
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

    public List<InvoiceHasProduct> getInvoicesHasProducts() {
        return invoicesHasProducts;
    }

    public void setInvoicesHasProducts(List<InvoiceHasProduct> invoicesHasProducts) {
        this.invoicesHasProducts = invoicesHasProducts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", reference='" + reference + '\'' +
                ", invoicesHasProducts=" + invoicesHasProducts +
                '}';
    }
}
